package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysProductMapper {
    long countByExample(SysProductExample example);

    int deleteByExample(SysProductExample example);

    int deleteByPrimaryKey(Integer prId);

    int insert(SysProduct record);

    int insertSelective(SysProduct record);

    List<SysProduct> selectByExample(SysProductExample example);

    SysProduct selectByPrimaryKey(Integer prId);

    int updateByExampleSelective(@Param("record") SysProduct record, @Param("example") SysProductExample example);

    int updateByExample(@Param("record") SysProduct record, @Param("example") SysProductExample example);

    int updateByPrimaryKeySelective(SysProduct record);

    int updateByPrimaryKey(SysProduct record);
}