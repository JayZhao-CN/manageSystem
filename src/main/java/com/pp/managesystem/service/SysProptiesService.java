package com.pp.managesystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pp.managesystem.entity.SysPropties;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
public interface SysProptiesService extends IService<SysPropties> {

    List<SysPropties> getByCompany(String company,boolean isAll);

    SysPropties selectByNameAndCompany(String name, String company);

    int addPropties(SysPropties sysPropties);

    int deletePropties(int id,String company);
}
