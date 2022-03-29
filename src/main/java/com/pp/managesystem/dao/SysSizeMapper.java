package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.entity.SysSizeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SysSizeMapper {
    long countByExample(SysSizeExample example);

    int deleteByExample(SysSizeExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(SysSize record);

    int insertSelective(SysSize record);

    List<SysSize> selectByExample(SysSizeExample example);

    List<SysSize> selectByCompany(String company);

    String selectMaxCode(String perCode);

    SysSize selectByPrimaryKey(Integer sId);

    SysSize selectByNameAndCompany(String name, String company);

    int updateByExampleSelective(@Param("record") SysSize record, @Param("example") SysSizeExample example);

    int updateByExample(@Param("record") SysSize record, @Param("example") SysSizeExample example);

    int updateByPrimaryKeySelective(SysSize record);

    int updateByPrimaryKey(SysSize record);
}