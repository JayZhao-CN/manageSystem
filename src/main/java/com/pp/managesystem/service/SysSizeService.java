package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysSizeMapper;
import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.entity.SysSizeExample;
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
public class SysSizeService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysSizeMapper sysSizeMapper;

    public List<SysSize> getAllSizes(){
        return sysSizeMapper.selectByExample(new SysSizeExample());
    }

    /**
     * 根据公司查询尺寸
     * @param company
     * @return
     */
    public List<SysSize> getByCompany(String company){
        return sysSizeMapper.selectByCompany(company);
    }

    public SysSize selectByNameAndCompany(String name, String company) {
        return sysSizeMapper.selectByNameAndCompany(name,company);
    }

    public SysSize getSize(int id) {
        return sysSizeMapper.selectByPrimaryKey(id);
    }

    /**
     * 添加颜色生成编号
     * @param sysSize
     * @return
     */
    public Integer addSize(SysSize sysSize) {

        /**
         * 生成尺寸编号 年月日+编号
         */
        String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String year = ymd[0].substring(2, 4);
        // 生成了年月日
        String perCode = year + ymd[1] + ymd[2];
        // 查询当前日期最大编号
        String maxCode = sysSizeMapper.selectMaxCode(perCode);
        // 默认为年月日+1
        String sCode = perCode + 1;
        // 查询为年月日+max+1
        if (maxCode != null && !maxCode.equals("")) {
            // 这个才是当日最大
            String currentNum = maxCode.substring(6);
            sCode = maxCode.substring(0,6) + (Integer.parseInt(currentNum) + 1);
        }
        sysSize.setsCode(sCode);

        return sysSizeMapper.insert(sysSize);
    }

    public Integer updateSize(SysSize sysSize) {
        return sysSizeMapper.updateByPrimaryKeySelective(sysSize);
    }

    public int deleteSize(int id, String company) {
        SysSize sysSize = sysSizeMapper.selectByPrimaryKey(id);
        if (sysSize.getsCompany().equals(company)) {
                return sysSizeMapper.updateByPrimaryKeySelective(new SysSize(id,"/"+company));
            }else {
                return -1;
            }
        }
}
