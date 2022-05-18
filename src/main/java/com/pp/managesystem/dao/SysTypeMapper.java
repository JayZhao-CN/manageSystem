package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.entity.SysTypeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysTypeMapper {
    long countByExample(SysTypeExample example);

    int deleteByExample(SysTypeExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(SysType record);

    int insertSelective(SysType record);

    List<SysType> selectByExample(SysTypeExample example);

    String selectMaxCode(String perCode);

    SysType selectByPrimaryKey(Integer tId);

    List<SysType> selectByCompany(String company);

    SysType selectByCode(String code);

    SysType selectByNameAndCompany(String name, String company);

    int updateByExampleSelective(@Param("record") SysType record, @Param("example") SysTypeExample example);

    int updateByExample(@Param("record") SysType record, @Param("example") SysTypeExample example);

    int updateByPrimaryKeySelective(SysType record);

    int updateByPrimaryKey(SysType record);
}