package com.pp.managesystem.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pp.managesystem.entity.SysProductPropties;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
public interface SysProductProptiesService extends IService<SysProductPropties> {

    List<Map> getDetail(int pageNum, int pageSize, String company);

    int updateProductPropties(SysProductPropties sysProductPropties, String company);
}
