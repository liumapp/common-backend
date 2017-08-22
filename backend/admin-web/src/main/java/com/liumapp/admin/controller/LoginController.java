package com.liumapp.admin.controller;

import com.liumapp.admin.form.LoginForm;
import com.liumapp.admin.shiro.model.SysAdmin;
import com.liumapp.admin.shiro.service.SysAdminService;
import com.liumapp.common.security.auth.BCryptPasswordEncoder;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by liumapp on 8/22/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
public class LoginController {

    @Autowired
    private SysAdminService userService;

    @GetMapping("/login")
    public String login(LoginForm loginForm) {
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()){
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(@Valid LoginForm loginForm, BindingResult error) {

        if (error.hasErrors()) {
            return "login";
        }

        UsernamePasswordToken token = new UsernamePasswordToken(loginForm.getUsername(), loginForm.getPassword());

        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
            Long userId = (Long) subject.getPrincipal();
            SysAdmin user = new SysAdmin();
            user.setId(userId);
            user.setLastLoginTime(new Date());
            userService.updateUser(user);
        } catch (IncorrectCredentialsException ice) {
            error.addError(new FieldError(error.getObjectName(),"password", "密码错误!"));
            return "login";
        } catch (UnknownAccountException uae) {
            error.addError(new FieldError(error.getObjectName(),"username", "用户名错误或不存在!"));
            return "login";
        } catch (ExcessiveAttemptsException eae) {
            error.addError(new FieldError(error.getObjectName(),"username", "超时!"));
            return "login";
        } catch (LockedAccountException lax) {
            error.addError(new FieldError(error.getObjectName(),"username", "账号被锁住!"));
            return "login";
        }
        return "redirect:/";
    }


    @GetMapping("/mock/create/{name}")
    @ResponseBody
    public SysAdmin create(@PathVariable(name="name") String name) {
        SysAdmin user  = new SysAdmin();
        user.setUsername(name);
        user.setEmail(name + "@zb.org");
        user.setStatus(0);
        user.setCreateTime(new Date());
        user.setPassword(new BCryptPasswordEncoder().encode("123456"));
        userService.saveUser(user);
        return user;
    }

}
