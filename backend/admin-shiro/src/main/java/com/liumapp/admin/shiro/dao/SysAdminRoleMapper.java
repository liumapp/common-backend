package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysAdminRole;
import com.liumapp.admin.shiro.model.SysAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminRoleMapper {
    long countByExample(SysAdminRoleExample example);

    int deleteByExample(SysAdminRoleExample example);

    int insert(SysAdminRole record);

    int insertSelective(SysAdminRole record);

    List<SysAdminRole> selectByExample(SysAdminRoleExample example);

    int updateByExampleSelective(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);

    int updateByExample(@Param("record") SysAdminRole record, @Param("example") SysAdminRoleExample example);
}