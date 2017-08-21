package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysRole;
import com.liumapp.admin.shiro.model.SysRoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper {
    List<SysRole> searchAll(Map<String, Object> role);

    List<SysRole> selectByUserId(Long uid);

    int batchDeleteByIds(Long[] ids);

    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}