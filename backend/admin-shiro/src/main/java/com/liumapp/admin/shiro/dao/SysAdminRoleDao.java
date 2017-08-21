package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysAdminRole;

/**
 * Created by liumapp on 8/21/17 5:05 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysAdminRoleDao {
    int insert(SysAdminRole record);

    int insertSelective(SysAdminRole record);
}