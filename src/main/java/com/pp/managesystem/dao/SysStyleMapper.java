package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysStyle;
import com.pp.managesystem.entity.SysStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysStyleMapper {
    long countByExample(SysStyleExample example);

    int deleteByExample(SysStyleExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(SysStyle record);

    int insertSelective(SysStyle record);

    List<SysStyle> selectByExample(SysStyleExample example);

    SysStyle selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") SysStyle record, @Param("example") SysStyleExample example);

    int updateByExample(@Param("record") SysStyle record, @Param("example") SysStyleExample example);

    int updateByPrimaryKeySelective(SysStyle record);

    int updateByPrimaryKey(SysStyle record);
}