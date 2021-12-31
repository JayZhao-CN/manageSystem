package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysColorMapper;
import com.pp.managesystem.entity.SysColor;
import com.pp.managesystem.entity.SysColorExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysColorService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysColorMapper sysColorMapper;

    public List<SysColor> getAllColors(){
        return sysColorMapper.selectByExample(new SysColorExample());
    }

    public SysColor getColor(int id) {
        return sysColorMapper.selectByPrimaryKey(id);
    }

    public Integer addColor(SysColor sysColor) {
        return sysColorMapper.insert(sysColor);
    }

    public Integer updateColor(SysColor sysColor) {
        return sysColorMapper.updateByPrimaryKeySelective(sysColor);
    }

    public int deleteColor(int id) {
        return sysColorMapper.deleteByPrimaryKey(id);
    }
}
