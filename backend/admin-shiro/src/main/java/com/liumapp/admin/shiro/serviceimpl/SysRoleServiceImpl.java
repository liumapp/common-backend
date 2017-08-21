package com.liumapp.admin.shiro.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.liumapp.admin.shiro.dao.SysRoleMapper;
import com.liumapp.admin.shiro.model.SysRole;
import com.liumapp.admin.shiro.service.SysRoleService;
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
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole findById(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    public List<SysRole> findByUserId(Long userId) {
        return roleMapper.selectByUserId(userId);
    }

    public List<SysRole> searchAll(Map<String, Object> role) {
        PageHelper.startPage(1, 10);
        return roleMapper.searchAll(role);
    }

    public int saveRole(SysRole role){
        return roleMapper.insert(role);
    }

    public int updateRole(SysRole role) {
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    public int batchDeleteByIds(Long[] ids){
        return roleMapper.batchDeleteByIds(ids);
    }

    public int deleteRole(SysRole role) {
        return roleMapper.deleteByPrimaryKey(role.getId());
    }
}
