package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysTableInfo;
import com.pp.managesystem.entity.SysTableInfoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysTableInfoMapper {
    long countByExample(SysTableInfoExample example);

    int deleteByExample(SysTableInfoExample example);

    int deleteByPrimaryKey(Integer tiId);

    int insert(SysTableInfo record);

    int insertSelective(SysTableInfo record);

    List<SysTableInfo> selectByExample(SysTableInfoExample example);

    SysTableInfo selectByPrimaryKey(Integer tiId);

    int updateByExampleSelective(@Param("record") SysTableInfo record, @Param("example") SysTableInfoExample example);

    int updateByExample(@Param("record") SysTableInfo record, @Param("example") SysTableInfoExample example);

    int updateByPrimaryKeySelective(SysTableInfo record);

    int updateByPrimaryKey(SysTableInfo record);
}