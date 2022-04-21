package com.pp.managesystem.service;

import com.pp.managesystem.dao.SysProductMapper;
import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysProductExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysProductService {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SysProductMapper sysProductMapper;

    public List<SysProduct> getAllProducts(){
        return sysProductMapper.selectByExample(new SysProductExample());
    }

    public SysProduct getProduct(int id) {
        return sysProductMapper.selectByPrimaryKey(id);
    }

    public Integer addProduct(SysProduct sysProduct) {
        return sysProductMapper.insert(sysProduct);
    }

    public Integer updateProduct(SysProduct sysProduct) {
        return sysProductMapper.updateByPrimaryKeySelective(sysProduct);
    }

    public int deleteProduct(int id) {
        return sysProductMapper.deleteByPrimaryKey(id);
    }
}
