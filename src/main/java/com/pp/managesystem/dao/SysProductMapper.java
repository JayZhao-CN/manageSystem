package com.pp.managesystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pp.managesystem.entity.SysProduct;

import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
public interface SysProductMapper extends BaseMapper<SysProduct> {

    Map selectMaxByTypeAndBatchAndCompany(String typeCode, String company);
}
