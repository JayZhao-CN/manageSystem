package com.pp.managesystem.dao;

import com.pp.managesystem.entity.SysUser;
import com.pp.managesystem.entity.form.SysUserDetail;
import com.pp.managesystem.entity.SysUserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface SysUserMapper {
    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    String selectMaxCode(String preCode);

    List<Map<String,String>> selectEqCode(String company);

    List<Map<String,String>> selectEqNewUser(Map map);

    List<SysUserDetail> selectAll();

    List<SysUserDetail> selectCompanyAll(String uCompany);

    List<SysUserDetail> selectUserLikeCompany(String uCompany);

    SysUser selectByPrimaryKey(Integer uId);

    SysUser selectByCode(String code);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    int updateToken(SysUser sysUser);

    String selectUsernameByCode(String code);
}