package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysPositionMapper;
import com.pp.managesystem.entity.SysPosition;
import com.pp.managesystem.entity.SysPositionExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPositionService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysPositionMapper sysPositionMapper;

    public List<SysPosition> getAllPositions(){
        return sysPositionMapper.selectByExample(new SysPositionExample());
    }

    public SysPosition getPosition(int id) {
        return sysPositionMapper.selectByPrimaryKey(id);
    }

    public List<SysPosition> getPositionByCompany(String company) {
        return sysPositionMapper.selectByCompany(company);
    }

    public Integer addPosition(SysPosition sysPosition) {
        return sysPositionMapper.insert(sysPosition);
    }

    public Integer updatePosition(SysPosition sysPosition) {
        return sysPositionMapper.updateByPrimaryKeySelective(sysPosition);
    }

    public int deletePosition(int id) {
        return sysPositionMapper.deleteByPrimaryKey(id);
    }
}
