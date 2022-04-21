package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysUrlAuth;
import com.pp.managesystem.entity.SysUrlAuthExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysUrlAuthMapper {
    long countByExample(SysUrlAuthExample example);

    int deleteByExample(SysUrlAuthExample example);

    int deleteByPrimaryKey(Integer uaId);

    int insert(SysUrlAuth record);

    int insertSelective(SysUrlAuth record);

    List<SysUrlAuth> selectByExample(SysUrlAuthExample example);

    SysUrlAuth selectByPrimaryKey(Integer uaId);

    List<SysUrlAuth> selectByUrl(String url);

    int updateByExampleSelective(@Param("record") SysUrlAuth record, @Param("example") SysUrlAuthExample example);

    int updateByExample(@Param("record") SysUrlAuth record, @Param("example") SysUrlAuthExample example);

    int updateByPrimaryKeySelective(SysUrlAuth record);

    int updateByPrimaryKey(SysUrlAuth record);
}