package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysColorMapper;
import com.pp.managesystem.entity.SysColor;
import com.pp.managesystem.entity.SysColorExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class SysColorService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysColorMapper sysColorMapper;

    public List<SysColor> getAllColors(){
        return sysColorMapper.selectByExample(new SysColorExample());
    }

    /**
     * 根据公司查询颜色
     * @param company
     * @return
     */
    public List<SysColor> getByCompany(String company){
        return sysColorMapper.selectByCompany(company);
    }

    public SysColor getColor(int id) {
        return sysColorMapper.selectByPrimaryKey(id);
    }
    public SysColor selectByNameAndCompany(String name,String company) {
        return sysColorMapper.selectByNameAndCompany(name,company);
    }

    /**
     * 添加颜色生成编号
     * @param sysColor
     * @return
     */
    public Integer addColor(SysColor sysColor) {

        /**
         * 生成颜色编号 年月日+编号
         */
        String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String year = ymd[0].substring(2, 4);
        // 生成了年月日
        String perCode = year + ymd[1] + ymd[2];
        // 查询当前日期最大编号
        String maxCode = sysColorMapper.selectMaxCode(perCode);
        // 默认为年月日+1
        String cCode = perCode + 1;
        // 查询为年月日+max+1
        if (maxCode != null && !maxCode.equals("")) {
            // 这个才是当日最大
            String currentNum = maxCode.substring(6);
            cCode = maxCode.substring(0,6) + (Integer.parseInt(currentNum) + 1);
        }
        sysColor.setcCode(cCode);

        return sysColorMapper.insert(sysColor);
    }

    public Integer updateColor(SysColor sysColor) {
        return sysColorMapper.updateByPrimaryKeySelective(sysColor);
    }

    public int deleteColor(int id, String company) {
        SysColor sysColor = sysColorMapper.selectByPrimaryKey(id);
        if (sysColor.getcCompany().equals(company)) {
            return sysColorMapper.updateByPrimaryKeySelective(new SysColor(id,"/"+company));
        }else {
            return -1;
        }
    }
}
