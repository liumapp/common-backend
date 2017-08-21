package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysAdmin;


/**
 * Created by liumapp on 8/21/17 5:05 PM.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysAdminDao {
    int deleteByPrimaryKey(Long id);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    SysAdmin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);
}

