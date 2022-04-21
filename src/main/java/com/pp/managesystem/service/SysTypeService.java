package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.entity.SysTypeExample;
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
public class SysTypeService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysTypeMapper sysTypeMapper;

    /**
     * 根据公司查询种类
     * @param company
     * @return
     */
    public List<SysType> getByCompany(String company){
        return sysTypeMapper.selectByCompany(company);
    }

    public SysType selectByNameAndCompany(String name, String company) {
        return sysTypeMapper.selectByNameAndCompany(name,company);
    }

    public List<SysType> getAllTypes(){
        return sysTypeMapper.selectByExample(new SysTypeExample());
    }

    public SysType getType(int id) {
        return sysTypeMapper.selectByPrimaryKey(id);
    }

    /**
     * 添加type生成编号
     * @param sysType
     * @return
     */
    public Integer addType(SysType sysType) {
        /**
         * 生成编号 年月日+编号
         */
        String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String year = ymd[0].substring(2, 4);
        // 生成了年月日
        String perCode = year + ymd[1] + ymd[2];
        // 查询当前日期最大编号
        String maxCode = sysTypeMapper.selectMaxCode(perCode);
        // 默认为年月日+1
        String tCode = perCode + 1;
        // 查询为年月日+max+1
        if (maxCode != null && !maxCode.equals("")) {
            // 这个才是当日最大
            String currentNum = maxCode.substring(6);
            tCode = maxCode.substring(0,6) + (Integer.parseInt(currentNum) + 1);
        }
        sysType.settCode(tCode);

        return sysTypeMapper.insert(sysType);
    }

    public Integer updateType(SysType sysType) {
        return sysTypeMapper.updateByPrimaryKeySelective(sysType);
    }

    public int deleteType(int id,String company) {
        SysType sysType = sysTypeMapper.selectByPrimaryKey(id);
        if (sysType.gettCompany().equals(company)) {
            return sysTypeMapper.updateByPrimaryKeySelective(new SysType(id,"/"+company));
        }else {
            return -1;
        }
    }
}
