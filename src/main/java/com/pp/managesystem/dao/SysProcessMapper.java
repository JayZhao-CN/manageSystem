package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysProcess;
import com.pp.managesystem.entity.SysProcessExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysProcessMapper {
    long countByExample(SysProcessExample example);

    int deleteByExample(SysProcessExample example);

    int deleteByPrimaryKey(Integer prcId);

    int insert(SysProcess record);

    int insertSelective(SysProcess record);

    List<SysProcess> selectByCompany(String company);

    SysProcess selectByNameAndCompany(String name, String company);

    String selectMaxCode(String perCode);

    List<SysProcess> selectByExample(SysProcessExample example);

    SysProcess selectByPrimaryKey(Integer prcId);

    int updateByExampleSelective(@Param("record") SysProcess record, @Param("example") SysProcessExample example);

    int updateByExample(@Param("record") SysProcess record, @Param("example") SysProcessExample example);

    int updateByPrimaryKeySelective(SysProcess record);

    int updateByPrimaryKey(SysProcess record);
}