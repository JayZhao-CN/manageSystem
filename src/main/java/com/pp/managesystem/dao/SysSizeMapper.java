package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysSize;
import com.pp.managesystem.entity.SysSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysSizeMapper {
    long countByExample(SysSizeExample example);

    int deleteByExample(SysSizeExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(SysSize record);

    int insertSelective(SysSize record);

    List<SysSize> selectByExample(SysSizeExample example);

    SysSize selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") SysSize record, @Param("example") SysSizeExample example);

    int updateByExample(@Param("record") SysSize record, @Param("example") SysSizeExample example);

    int updateByPrimaryKeySelective(SysSize record);

    int updateByPrimaryKey(SysSize record);
}