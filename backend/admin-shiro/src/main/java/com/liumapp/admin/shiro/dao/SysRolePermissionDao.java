package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysRolePermission;

/**
 * Created by liumapp on 8/21/17 5:06 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysRolePermissionDao {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);
}