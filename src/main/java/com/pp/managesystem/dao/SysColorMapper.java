package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysColor;
import com.pp.managesystem.entity.SysColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysColorMapper {
    long countByExample(SysColorExample example);

    int deleteByExample(SysColorExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(SysColor record);

    int insertSelective(SysColor record);

    List<SysColor> selectByExample(SysColorExample example);

    SysColor selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") SysColor record, @Param("example") SysColorExample example);

    int updateByExample(@Param("record") SysColor record, @Param("example") SysColorExample example);

    int updateByPrimaryKeySelective(SysColor record);

    int updateByPrimaryKey(SysColor record);
}