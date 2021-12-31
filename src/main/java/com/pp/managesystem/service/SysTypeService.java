package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysTypeMapper;
import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.entity.SysTypeExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysTypeService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysTypeMapper sysTypeMapper;

    public List<SysType> getAllTypes(){
        return sysTypeMapper.selectByExample(new SysTypeExample());
    }

    public SysType getType(int id) {
        return sysTypeMapper.selectByPrimaryKey(id);
    }

    public Integer addType(SysType sysType) {
        return sysTypeMapper.insert(sysType);
    }

    public Integer updateType(SysType sysType) {
        return sysTypeMapper.updateByPrimaryKeySelective(sysType);
    }

    public int deleteType(int id) {
        return sysTypeMapper.deleteByPrimaryKey(id);
    }
}
