package com.liumapp.admin.shiro.service;

import com.liumapp.admin.shiro.model.SysRole;

import java.util.List;
import java.util.Map;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public interface SysRoleService {

    public SysRole findById(Long id) ;

    public List<SysRole> findByUserId(Long userId);

    public List<SysRole> searchAll(Map<String , Object> role);

    public int saveRole(SysRole role);

    public int updateRole(SysRole role);

    public int batchDeleteByIds(Long[] ids);

    public int deleteRole(SysRole role);

}
