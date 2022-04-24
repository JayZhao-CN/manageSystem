package com.pp.managesystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pp.managesystem.entity.SysExtPropties;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jay
 * @since 2022-04-24
 */
public interface SysExtProptiesService extends IService<SysExtPropties> {

    List<Map> getByCompanyAndType(String company, String proptiesType);
}
