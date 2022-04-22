package com.pp.managesystem.service.impl;

import cn.hutool.core.util.IdUtil;
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
    public List<SysPropties> getByCompany(String company,boolean isAll) {

        // 通过公司查询属性配置
        QueryWrapper<SysPropties> queryWrapper = new QueryWrapper<>();
        if (isAll){
            queryWrapper.eq("propties_company_code",company).or().eq("propties_company_code","1");
        }else {
            queryWrapper.eq("propties_company_code",company);
        }
        List<SysPropties> sysProptieses = sysProptiesMapper.selectList(queryWrapper);
        return sysProptieses;
    }

    @Override
    public SysPropties selectByNameAndCompany(String name, String company) {
        return sysProptiesMapper.selectByNameAndCompany(name, company);
    }

    @Override
    public int addPropties(SysPropties sysPropties) {
        String code = IdUtil.fastSimpleUUID();
        sysPropties.setProptiesCode(code);
        return sysProptiesMapper.insert(sysPropties);
    }

    @Override
    public int deletePropties(int id, String company) {
        SysPropties sysPropties = sysProptiesMapper.selectById(id);

        if (sysPropties.getProptiesCompanyCode().equals(company)) {
//            QueryWrapper<SysPropties> queryWrapper = new QueryWrapper<>();
            SysPropties propties = new SysPropties();
            propties.setId(id);
            propties.setProptiesCompanyCode("/"+company);

            return sysProptiesMapper.updateById(propties);
        }else {
            return -1;
        }
    }
}
