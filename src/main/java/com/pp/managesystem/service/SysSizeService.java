package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysSizeMapper;
import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.entity.SysSizeExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysSizeService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysSizeMapper sysSizeMapper;

    public List<SysSize> getAllSizes(){
        return sysSizeMapper.selectByExample(new SysSizeExample());
    }

    public SysSize getSize(int id) {
        return sysSizeMapper.selectByPrimaryKey(id);
    }

    public Integer addSize(SysSize sysSize) {
        return sysSizeMapper.insert(sysSize);
    }

    public Integer updateSize(SysSize sysSize) {
        return sysSizeMapper.updateByPrimaryKeySelective(sysSize);
    }

    public int deleteSize(int id) {
        return sysSizeMapper.deleteByPrimaryKey(id);
    }
}
