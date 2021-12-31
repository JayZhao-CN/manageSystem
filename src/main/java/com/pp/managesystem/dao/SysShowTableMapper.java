package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysShowTable;
import com.pp.managesystem.entity.SysShowTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysShowTableMapper {
    long countByExample(SysShowTableExample example);

    int deleteByExample(SysShowTableExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(SysShowTable record);

    int insertSelective(SysShowTable record);

    List<SysShowTable> selectByExample(SysShowTableExample example);

    SysShowTable selectByPrimaryKey(Integer stId);

    List<SysShowTable> selectByTableId(Integer stTable);

    int updateByExampleSelective(@Param("record") SysShowTable record, @Param("example") SysShowTableExample example);

    int updateByExample(@Param("record") SysShowTable record, @Param("example") SysShowTableExample example);

    int updateByPrimaryKeySelective(SysShowTable record);

    int updateByPrimaryKey(SysShowTable record);
}