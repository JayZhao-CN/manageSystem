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

    List<SysPropties> getByCompany(String company);
}
