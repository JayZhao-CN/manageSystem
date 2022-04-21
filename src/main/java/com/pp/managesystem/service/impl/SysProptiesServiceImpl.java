package com.pp.managesystem.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pp.managesystem.dao.SysProptiesMapper;
import com.pp.managesystem.entity.SysPropties;
import com.pp.managesystem.service.SysProptiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
@Service
public class SysProptiesServiceImpl extends ServiceImpl<SysProptiesMapper, SysPropties> implements SysProptiesService {

    @Autowired
    SysProptiesMapper sysProptiesMapper;

    @Override
    public List<SysPropties> getByCompany(String company) {

        // 通过公司查询属性配置
        QueryWrapper<SysPropties> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("propties_company_code",company);
        List<SysPropties> sysProptieses = sysProptiesMapper.selectList(queryWrapper);
        return sysProptieses;
    }
}
