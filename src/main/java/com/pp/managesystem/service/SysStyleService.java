package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysStyleMapper;
import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.entity.SysStyleExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SysStyleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysStyleMapper sysStyleMapper;

    public List<SysStyle> getAllStyles(){
        return sysStyleMapper.selectByExample(new SysStyleExample());
    }


    public List<SysStyle> getByCompany(String company){
        return sysStyleMapper.selectByCompany(company);
    }

    public SysStyle getStyle(int id) {
        return sysStyleMapper.selectByPrimaryKey(id);
    }

    public Integer addStyle(SysStyle sysStyle) {

        /**
         * 生成颜色编号 年月日+编号
         */
        String[] ymd = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).split("-");
        String year = ymd[0].substring(2, 4);
        // 生成了年月日
        String perCode = year + ymd[1] + ymd[2];
        // 查询当前日期最大编号
        String maxCode = sysStyleMapper.selectMaxCode(perCode);
        // 默认为年月日+1
        String stCode = perCode + 1;
        // 查询为年月日+max+1
        if (maxCode != null && !maxCode.equals("")) {
            stCode = String.valueOf(Integer.parseInt(maxCode) + 1);
        }
        sysStyle.setStCode(stCode);
        return sysStyleMapper.insert(sysStyle);
    }

    public SysStyle selectByNameAndCompany(String name, String company) {
        return sysStyleMapper.selectByNameAndCompany(name,company);
    }


    public Integer updateStyle(SysStyle sysStyle) {
        return sysStyleMapper.updateByPrimaryKeySelective(sysStyle);
    }

//    public int deleteStyle(int id) {
//        return sysStyleMapper.deleteByPrimaryKey(id);
//    }

    // 逻辑删除样式
    public int deleteStyle(int id, String company) {
        SysStyle sysStyle = sysStyleMapper.selectByPrimaryKey(id);
        if (sysStyle.getStCompany().equals(company)) {
            return sysStyleMapper.updateByPrimaryKeySelective(new SysStyle(id,"/"+company));
        }else {
            return -1;
        }
    }
}
