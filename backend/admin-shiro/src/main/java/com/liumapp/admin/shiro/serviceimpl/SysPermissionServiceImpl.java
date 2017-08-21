package com.liumapp.admin.shiro.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.liumapp.admin.shiro.dao.SysPermissionMapper;
import com.liumapp.admin.shiro.model.SysPermission;
import com.liumapp.admin.shiro.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Service
@Transactional
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionMapper permissionDao;

    /**
     * 根据角色ID查询权限
     */
    public List<SysPermission> findByRoleIds(List<Long> roleIds) {
        return permissionDao.selectByRoleIds(roleIds);
    }

    /**
     * 查询所有权限
     */
    @Override
    public List<SysPermission> SelectAllPer(Map<String, Object> params) {
        PageHelper.startPage(1, 10);
        return permissionDao.SelectAllPer(params);
    }
    @Override
    public int savePermission(SysPermission sysPermission) {

        return permissionDao.insertSelective(sysPermission);
    }
    @Override
    public SysPermission findByPermissionId(Long id) {

        return permissionDao.selectByPrimaryKey(id);
    }
    @Override
    public int delectPer(SysPermission permission) {
        return permissionDao.deleteByPrimaryKey(permission.getId());

    }
    @Override
    public int edit(SysPermission sysPermission) {

        return permissionDao.updateByPrimaryKeySelective(sysPermission);
    }
    @Override
    public int delectByfId(Long long1) {
        return permissionDao.deleteByPrimaryKey(long1);
    }
}
