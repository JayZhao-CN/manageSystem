package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysProcessRemarkMapper;
import com.pp.managesystem.entity.SysProcessRemark;
import com.pp.managesystem.entity.SysProcessRemarkExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysProcessRemarkService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProcessRemarkMapper sysProcessRemarkMapper;

    public List<SysProcessRemark> getAllProcessRemarks(){
        return sysProcessRemarkMapper.selectByExample(new SysProcessRemarkExample());
    }

    public SysProcessRemark getProcessRemark(int id) {
        return sysProcessRemarkMapper.selectByPrimaryKey(id);
    }

    public Integer addProcessRemark(SysProcessRemark sysProcessRemark) {
        return sysProcessRemarkMapper.insert(sysProcessRemark);
    }

    public Integer updateProcessRemark(SysProcessRemark sysProcessRemark) {
        return sysProcessRemarkMapper.updateByPrimaryKeySelective(sysProcessRemark);
    }

    public int deleteProcessRemark(int id) {
        return sysProcessRemarkMapper.deleteByPrimaryKey(id);
    }
}
