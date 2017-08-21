package com.liumapp.admin.shiro.service;

import com.github.pagehelper.PageHelper;
import com.liumapp.admin.shiro.dao.SysAdminMapper;
import com.liumapp.admin.shiro.model.SysAdmin;
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
public interface SysAdminService {

    public List<SysAdmin> searchAll(Map<String, Object> user);

    public SysAdmin findById(Long id);

    public SysAdmin findByUsername(String username);

    public int saveUser(SysAdmin user);

    public int updateUser(SysAdmin user);

    public int batchDeleteByIds(Long[] ids);

    public int deleteUser(SysAdmin user);



}
