package com.liumapp.admin.shiro.credential;

import com.liumapp.admin.shiro.model.SysAdmin;
import com.liumapp.admin.shiro.model.SysPermission;
import com.liumapp.admin.shiro.model.SysRole;
import com.liumapp.admin.shiro.service.SysAdminService;
import com.liumapp.admin.shiro.service.SysPermissionService;
import com.liumapp.admin.shiro.service.SysRoleService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class CustomShiroRealm  extends AuthorizingRealm {

    @Autowired
    private SysAdminService userService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private SysRoleService roleService;

    /**
     * stored authorization data (roles, permissions, etc)
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {

        Long userId = (Long) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        List<SysRole> roles = roleService.findByUserId(userId);
        if (roles != null) {

            Set<String> roleNames = new HashSet<String>();
            List<Long> roleIds = new ArrayList<Long>();
            for(SysRole role : roles) {
                roleNames.add(role.getName());
                roleIds.add(role.getId());
            }
            authorizationInfo.setRoles(roleNames);

            List<SysPermission> permissions = permissionService.findByRoleIds(roleIds);
            if (permissions != null) {

                Set<String> stringPermissions = new HashSet<String>();
                for(SysPermission permission : permissions ) {
                    stringPermissions.add(permission.getName());
                }
                authorizationInfo.setStringPermissions(stringPermissions);
            }
        }

        return authorizationInfo;
    }

    /**
     *  stored account information
     *  认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        String username = (String) authcToken.getPrincipal();
        SysAdmin user = userService.findByUsername(username);
        if (user == null) {
            // 用户名不存在抛出异常
            throw new UnknownAccountException();
        }
        if (user.getStatus() == 1) {
            // 用户被管理员锁定抛出异常
            throw new LockedAccountException();
        }
        SimpleAuthenticationInfo authenticationInfo =
                new SimpleAuthenticationInfo(user.getId(),user.getPassword(), getName());
        return authenticationInfo;
    }
}