package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysCompanyMapper;
import com.pp.managesystem.entity.SysCompany;
import com.pp.managesystem.entity.SysCompanyExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysCompanyService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysCompanyMapper sysCompanyMapper;

    public List<SysCompany> getAllCompanys(){
        return sysCompanyMapper.selectByExample(new SysCompanyExample());
    }

    public SysCompany getCompany(int id) {
        return sysCompanyMapper.selectByPrimaryKey(id);
    }

    public SysCompany getCompanyByCode(String code) {
        return sysCompanyMapper.selectByCompanyCode(code);
    }


    public Integer addCompany(SysCompany sysCompany) {
        return sysCompanyMapper.insert(sysCompany);
    }

    public Integer updateCompany(SysCompany sysCompany) {
        return sysCompanyMapper.updateByPrimaryKeySelective(sysCompany);
    }

    public int deleteCompany(int id) {
        return sysCompanyMapper.deleteByPrimaryKey(id);
    }

    public List<SysCompany> queryLikeName(String coName){
        return sysCompanyMapper.selectByLikeName(coName);
    }
}
