package com.liumapp.admin.shiro.controller;

import com.github.pagehelper.Page;
import com.liumapp.admin.shiro.form.UserForm;
import com.liumapp.admin.shiro.model.SysAdmin;
import com.liumapp.admin.shiro.service.SysAdminService;
import com.liumapp.common.result.AjaxResult;
import com.liumapp.common.security.auth.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SysAdminService adminService;

    @GetMapping("/add")
    public String add(UserForm userForm){
        return "admin/add";
    }

    @PostMapping("/add")
    @ResponseBody()
    public AjaxResult add(@Validated(UserForm.CreateUser.class) UserForm userForm, BindingResult result) {
        AjaxResult rst = new AjaxResult();
        if(result.hasErrors()) {
            rst.setCode("error");
            rst.setValidatedResult(result);
            return rst;
        }

        SysAdmin user = new SysAdmin();
        user.setUsername(userForm.getUsername());
        user.setEmail(userForm.getEmail());
        user.setCreateTime(new Date());
        user.setStatus(0);
        if(userForm.getPassword()!=null) {
            user.setPassword(new BCryptPasswordEncoder().encode(userForm.getPassword()));
        }

        if(adminService.saveUser(user) > 0) {

            rst.setCode("success");
            rst.setMessage("添加成功");
        } else {

            rst.setCode("error");
            rst.setMessage("服务器错误");
        }

        return rst;
    }

    @GetMapping("/edit/{id}")
    public String edit( UserForm userForm,@PathVariable(name="id") Long id){
        SysAdmin user = adminService.findById(id);
        userForm.setUsername(user.getUsername());
        userForm.setEmail(user.getEmail());
        return "admin/edit";
    }

    @PostMapping("/edit/{id}")
    @ResponseBody()
    public AjaxResult edit(@PathVariable(name="id") Long id, @Validated(UserForm.EditUser.class) UserForm userForm, BindingResult result) {
        AjaxResult rst = new AjaxResult();
        if(result.hasErrors()) {
            rst.setCode("error");
            rst.setValidatedResult(result);
            return rst;
        }
        SysAdmin user = adminService.findById(id);
        if (user != null) {
            user.setUsername(userForm.getUsername());
            user.setEmail(userForm.getEmail());
            if (userForm.getPassword() != null) {
                user.setPassword(new BCryptPasswordEncoder().encode(userForm.getPassword()));
            }
            if(adminService.updateUser(user) > 0) {

                rst.setCode("success");
                rst.setMessage("更新成功");
            } else {

                rst.setCode("error");
                rst.setMessage("服务器错误");
            }
        } else {
            rst.setCode("error");
            rst.setMessage("用户不存在");
        }
        return rst;
    }

    @PostMapping("/status")
    @ResponseBody
    public int changeStatus(@RequestParam Long id, @RequestParam Integer status)
    {
        SysAdmin user = new SysAdmin();
        user.setId(id);
        user.setStatus(status);
        return adminService.updateUser(user);
    }


    @PostMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam Long id)
    {
        SysAdmin user = adminService.findById(id);
        return adminService.deleteUser(user);
    }

    @PostMapping("/batch-delete")
    @ResponseBody
    public int batchDelete(@RequestParam(name="ids[]") Long[] ids)
    {
        if(ids !=null) {
            return adminService.batchDeleteByIds(ids);
        }
        return 0;
    }

    @GetMapping("/list")
    public String list(ModelMap model, @RequestParam Map<String, Object> params){
        Page<SysAdmin> users = (Page<SysAdmin>) adminService.searchAll(params);
        model.addAttribute("params",params);
        model.addAttribute("users",users);
        model.addAttribute("totalRecords",users.getTotal());
        model.addAttribute("totalPages",users.getPages());
        model.addAttribute("pageNum",users.getPageNum());
        return "admin/list";
    }
}
