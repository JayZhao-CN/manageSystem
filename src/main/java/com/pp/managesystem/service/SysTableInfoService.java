package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysTableInfoMapper;
import com.pp.managesystem.entity.SysTableInfo;
import com.pp.managesystem.entity.SysTableInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysTableInfoService {

    @Autowired
    SysTableInfoMapper SysTableInfoMapper;

    public List<SysTableInfo> getAllTableInfos(){
        return SysTableInfoMapper.selectByExample(new SysTableInfoExample());
    }

    public SysTableInfo getTableInfo(int id) {
        return SysTableInfoMapper.selectByPrimaryKey(id);
    }

    public Integer addTableInfo(SysTableInfo sysTableInfo) {
        return SysTableInfoMapper.insert(sysTableInfo);
    }

    public Integer updateTableInfo(SysTableInfo sysTableInfo) {
        return SysTableInfoMapper.updateByPrimaryKeySelective(sysTableInfo);
    }

    public int deleteTableInfo(int id) {
        return SysTableInfoMapper.deleteByPrimaryKey(id);
    }
}
