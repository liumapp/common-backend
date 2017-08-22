package com.liumapp.admin.controller;

import com.liumapp.admin.shiro.model.SysAdmin;
import com.liumapp.admin.shiro.service.SysAdminService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liumapp on 8/22/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
public class IndexController {

    @Autowired
    private SysAdminService userService;

    @GetMapping("/")
    public String index(ModelMap model){
        Subject subject = SecurityUtils.getSubject();
        Long userId = (Long) subject.getPrincipal();
        SysAdmin user = userService.findById(userId);
        model.addAttribute("user",user);
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }

}
