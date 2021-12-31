package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysProcessRemark;
import com.pp.managesystem.entity.SysProcessRemarkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysProcessRemarkMapper {
    long countByExample(SysProcessRemarkExample example);

    int deleteByExample(SysProcessRemarkExample example);

    int deleteByPrimaryKey(Integer prrId);

    int insert(SysProcessRemark record);

    int insertSelective(SysProcessRemark record);

    List<SysProcessRemark> selectByExample(SysProcessRemarkExample example);

    SysProcessRemark selectByPrimaryKey(Integer prrId);

    int updateByExampleSelective(@Param("record") SysProcessRemark record, @Param("example") SysProcessRemarkExample example);

    int updateByExample(@Param("record") SysProcessRemark record, @Param("example") SysProcessRemarkExample example);

    int updateByPrimaryKeySelective(SysProcessRemark record);

    int updateByPrimaryKey(SysProcessRemark record);
}