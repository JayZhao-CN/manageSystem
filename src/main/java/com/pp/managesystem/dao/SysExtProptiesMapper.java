package com.pp.managesystem.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pp.managesystem.entity.SysExtPropties;
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
 * @since 2022-04-24
 */
@Mapper
@Repository
public interface SysExtProptiesMapper extends BaseMapper<SysExtPropties> {

    List<Map> getByCompanyAndType(String proptiesCode, String company);
}
