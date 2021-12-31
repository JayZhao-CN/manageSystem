package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysProcessMapper;
import com.pp.managesystem.entity.SysProcess;
import com.pp.managesystem.entity.SysProcessExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysProcessService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessMapper sysProcessMapper;

    public List<SysProcess> getAllProcesses(){
        return sysProcessMapper.selectByExample(new SysProcessExample());
    }

    public SysProcess getProcess(int id) {
        return sysProcessMapper.selectByPrimaryKey(id);
    }

    public Integer addProcess(SysProcess sysProcess) {
        return sysProcessMapper.insert(sysProcess);
    }

    public Integer updateProcess(SysProcess sysProcess) {
        return sysProcessMapper.updateByPrimaryKeySelective(sysProcess);
    }

    public int deleteProcess(int id) {
        return sysProcessMapper.deleteByPrimaryKey(id);
    }
}
