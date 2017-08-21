package com.liumapp.admin.shiro.service;

import com.liumapp.admin.shiro.model.SysPermission;

import java.util.List;
import java.util.Map;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysPermissionService {

    List<SysPermission> findByRoleIds(List<Long> roleIds);

    List<SysPermission> SelectAllPer(Map<String, Object> params);

    int savePermission(SysPermission sysPermission);

    SysPermission findByPermissionId(Long id);

    int delectPer(SysPermission permission);

    int edit(SysPermission sysPermission);

    int delectByfId(Long long1);


}
