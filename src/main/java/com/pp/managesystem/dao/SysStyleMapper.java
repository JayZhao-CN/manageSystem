package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.entity.SysStyleExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysStyleMapper {
    long countByExample(SysStyleExample example);

    int deleteByExample(SysStyleExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(SysStyle record);

    int insertSelective(SysStyle record);

    List<SysStyle> selectByExample(SysStyleExample example);

    List<SysStyle> selectByCompany(String company);

    SysStyle selectByPrimaryKey(Integer stId);

    SysStyle selectByNameAndCompany(String name, String company);

    int updateByExampleSelective(@Param("record") SysStyle record, @Param("example") SysStyleExample example);

    int updateByExample(@Param("record") SysStyle record, @Param("example") SysStyleExample example);

    int updateByPrimaryKeySelective(SysStyle record);

    int updateByPrimaryKey(SysStyle record);

    String selectMaxCode(String perCode);
}