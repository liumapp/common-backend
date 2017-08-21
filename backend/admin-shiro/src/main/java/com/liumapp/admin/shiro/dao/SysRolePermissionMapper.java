package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysRolePermission;
import com.liumapp.admin.shiro.model.SysRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRolePermissionMapper {
    long countByExample(SysRolePermissionExample example);

    int deleteByExample(SysRolePermissionExample example);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    List<SysRolePermission> selectByExample(SysRolePermissionExample example);

    int updateByExampleSelective(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);

    int updateByExample(@Param("record") SysRolePermission record, @Param("example") SysRolePermissionExample example);
}