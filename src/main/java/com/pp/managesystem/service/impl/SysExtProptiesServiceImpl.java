package com.pp.managesystem.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pp.managesystem.dao.SysExtProptiesMapper;
import com.pp.managesystem.entity.SysExtPropties;
import com.pp.managesystem.service.SysExtProptiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jay
 * @since 2022-04-24
 */
@Service
public class SysExtProptiesServiceImpl extends ServiceImpl<SysExtProptiesMapper, SysExtPropties> implements SysExtProptiesService {

    @Autowired
    SysExtProptiesMapper sysExtProptiesMapper;

    @Override
    public List<Map> getByCompanyAndType(String company, String proptiesType) {
        return sysExtProptiesMapper.getByCompanyAndType(proptiesType, company);
    }
}
