package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysType;
import com.pp.managesystem.entity.SysTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysTypeMapper {
    long countByExample(SysTypeExample example);

    int deleteByExample(SysTypeExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(SysType record);

    int insertSelective(SysType record);

    List<SysType> selectByExample(SysTypeExample example);

    SysType selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") SysType record, @Param("example") SysTypeExample example);

    int updateByExample(@Param("record") SysType record, @Param("example") SysTypeExample example);

    int updateByPrimaryKeySelective(SysType record);

    int updateByPrimaryKey(SysType record);
}