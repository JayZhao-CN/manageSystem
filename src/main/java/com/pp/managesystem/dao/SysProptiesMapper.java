package com.pp.managesystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pp.managesystem.entity.SysPropties;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
public interface SysProptiesMapper extends BaseMapper<SysPropties> {

    SysPropties selectByNameAndCompany(String name, String company);
}
