package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysPosition;
import com.pp.managesystem.entity.SysPositionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysPositionMapper {
    long countByExample(SysPositionExample example);

    int deleteByExample(SysPositionExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(SysPosition record);

    int insertSelective(SysPosition record);

    List<SysPosition> selectByExample(SysPositionExample example);

    SysPosition selectByPrimaryKey(Integer pId);

    List<SysPosition> selectByCompany(String pCompany);

    SysPosition selectByPositionCode(String code);

    int updateByExampleSelective(@Param("record") SysPosition record, @Param("example") SysPositionExample example);

    int updateByExample(@Param("record") SysPosition record, @Param("example") SysPositionExample example);

    int updateByPrimaryKeySelective(SysPosition record);

    int updateByPrimaryKey(SysPosition record);
}