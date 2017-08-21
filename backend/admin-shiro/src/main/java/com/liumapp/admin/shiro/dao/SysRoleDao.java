package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysRole;

public interface SysRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}