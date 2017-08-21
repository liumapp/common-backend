package com.liumapp.admin.shiro.dao;

import com.liumapp.admin.shiro.model.SysAdmin;
import com.liumapp.admin.shiro.model.SysAdminExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysAdminMapper {
    List<SysAdmin> searchAll(Map<String, Object> user);

    SysAdmin selectByUsername(String username);

    int batchDeleteByIds(Long[] ids);

    int countByExample(SysAdminExample example);

    int deleteByExample(SysAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAdmin record);

    int insertSelective(SysAdmin record);

    List<SysAdmin> selectByExample(SysAdminExample example);

    SysAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByExample(@Param("record") SysAdmin record, @Param("example") SysAdminExample example);

    int updateByPrimaryKeySelective(SysAdmin record);

    int updateByPrimaryKey(SysAdmin record);
}