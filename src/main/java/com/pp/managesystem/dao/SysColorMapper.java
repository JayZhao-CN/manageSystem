package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysColor;
import com.pp.managesystem.entity.SysColorExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysColorMapper {
    long countByExample(SysColorExample example);

    int deleteByExample(SysColorExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(SysColor record);

    int insertSelective(SysColor record);

    List<SysColor> selectByExample(SysColorExample example);

    List<SysColor> selectByCompany(String company);

    SysColor selectByPrimaryKey(Integer cId);

    String selectMaxCode(String perCode);

    SysColor selectByNameAndCompany(String name, String company);

    int updateByExampleSelective(@Param("record") SysColor record, @Param("example") SysColorExample example);

    int updateByExample(@Param("record") SysColor record, @Param("example") SysColorExample example);

    int updateByPrimaryKeySelective(SysColor record);

    int updateByPrimaryKey(SysColor record);
}