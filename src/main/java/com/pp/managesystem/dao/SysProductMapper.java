package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysProduct;
import com.pp.managesystem.entity.SysProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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