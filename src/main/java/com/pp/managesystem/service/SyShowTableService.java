package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysShowTableMapper;
import com.pp.managesystem.entity.SysShowTable;
import com.pp.managesystem.entity.SysShowTableExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class SyShowTableService {

    @Autowired
    SysShowTableMapper sysShowTableMapper;

    public List<SysShowTable> getAllShowTables(){
        return sysShowTableMapper.selectByExample(new SysShowTableExample());
    }

    public SysShowTable getShowTable(int id) {
        return sysShowTableMapper.selectByPrimaryKey(id);
    }

    public Integer addShowTable(SysShowTable sysTable) {
        return sysShowTableMapper.insert(sysTable);
    }

    public Integer updateShowTable(SysShowTable sysTable) {
        return sysShowTableMapper.updateByPrimaryKeySelective(sysTable);
    }

    public int deleteShowTable(int id) {
        return sysShowTableMapper.deleteByPrimaryKey(id);
    }

    public List<SysShowTable> selectShowTableByTableId(int id){
        return sysShowTableMapper.selectByTableId(id);
    }
}
