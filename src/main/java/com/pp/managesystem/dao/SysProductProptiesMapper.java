package com.pp.managesystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pp.managesystem.entity.SysProductPropties;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Jay
 * @since 2022-04-21
 */
@Mapper
@Repository
public interface SysProductProptiesMapper extends BaseMapper<SysProductPropties> {

    List<Map> getProptiesByTypeCode(String typeCode);
}
