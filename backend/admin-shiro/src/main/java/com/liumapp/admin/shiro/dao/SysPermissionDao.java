package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysPermission;

/**
 * Created by liumapp on 8/21/17 5:06 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysPermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}