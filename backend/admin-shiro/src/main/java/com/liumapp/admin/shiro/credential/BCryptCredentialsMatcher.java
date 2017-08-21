package com.liumapp.admin.shiro.credential;

import com.liumapp.common.security.auth.BCryptPasswordEncoder;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class BCryptCredentialsMatcher  implements CredentialsMatcher {

    // 声明一个缓存接口，这个接口是Shiro缓存管理的一部分，它的具体实现可以通过外部容器注入
    private Cache<String, AtomicInteger> passwordRetryCache;

    public BCryptCredentialsMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        AtomicInteger retryCount = passwordRetryCache.get(username);
        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username, retryCount);
        }
        // 自定义一个验证过程：当用户连续输入密码错误5次以上禁止用户登录一段时间
        if (retryCount.incrementAndGet() > 5) {
            throw new ExcessiveAttemptsException();
        }
        //Object obj =  (char[]) getSubmittedPassword(token);
        String rawPassword = (String) getSubmittedPassword(token);
        String encodedPassword = (String) getStoredPassword(info);
        boolean match =  new BCryptPasswordEncoder().matches(rawPassword, encodedPassword);
        if (match) {
            passwordRetryCache.remove(username);
        }
        return match;
    }


    protected Object getSubmittedPassword(AuthenticationToken token) {
        Object credentials = token != null ? token.getCredentials() : null;
        if (credentials instanceof char[]) {
            credentials = new String((char[]) credentials);
        }
        return credentials;
    }

    protected Object getStoredPassword(AuthenticationInfo storedAccountInfo) {
        Object stored = storedAccountInfo != null ? storedAccountInfo.getCredentials() : null;
        //fix for https://issues.apache.org/jira/browse/SHIRO-363
        if (stored instanceof char[]) {
            stored = new String((char[])stored);
        }
        return stored;
    }

}
