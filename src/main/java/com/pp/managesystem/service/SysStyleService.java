package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysStyleMapper;
import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.entity.SysStyleExample;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.entity.SysTypeExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysStyleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysStyleMapper sysStyleMapper;

    public List<SysStyle> getAllStyles(){
        return sysStyleMapper.selectByExample(new SysStyleExample());
    }

    public SysStyle getStyle(int id) {
        return sysStyleMapper.selectByPrimaryKey(id);
    }

    public Integer addStyle(SysStyle sysStyle) {
        return sysStyleMapper.insert(sysStyle);
    }

    public Integer updateStyle(SysStyle sysStyle) {
        return sysStyleMapper.updateByPrimaryKeySelective(sysStyle);
    }

    public int deleteStyle(int id) {
        return sysStyleMapper.deleteByPrimaryKey(id);
    }
}
