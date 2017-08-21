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
@Service
@Transactional
public class SysAdminService {

    @Autowired
    private SysAdminMapper adminMapper;

    public List<SysAdmin> searchAll(Map<String, Object> user) {
        PageHelper.startPage(1, 10);
        return adminMapper.searchAll(user);
    }

    public SysAdmin findById(Long id) {
        return adminMapper.selectByPrimaryKey(id);
    }

    public SysAdmin findByUsername(String username) {
        return adminMapper.selectByUsername(username);
    }

    public int saveUser(SysAdmin user){

        return adminMapper.insert(user);
    }

    public int updateUser(SysAdmin user) {
        return adminMapper.updateByPrimaryKeySelective(user);
    }

    public int batchDeleteByIds(Long[] ids){
        return adminMapper.batchDeleteByIds(ids);
    }

    public int deleteUser(SysAdmin user) {
        return adminMapper.deleteByPrimaryKey(user.getId());
    }

}
