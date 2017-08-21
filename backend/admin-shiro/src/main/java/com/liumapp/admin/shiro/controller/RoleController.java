package com.liumapp.admin.shiro.controller;

import com.github.pagehelper.Page;
import com.liumapp.admin.shiro.model.SysRole;
import com.liumapp.admin.shiro.service.SysRoleService;
import com.liumapp.common.result.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private SysRoleService roleService;

    @GetMapping("/add")
    public String add(SysRole sysRole){
        return "role/add";
    }

    @PostMapping("/add")
    @ResponseBody()
    public AjaxResult add(@Valid SysRole sysRole, BindingResult result) {
        AjaxResult rst = new AjaxResult();
        if(result.hasErrors()) {
            rst.setCode("error");
            rst.setValidatedResult(result);
            return rst;
        }

        if(roleService.saveRole(sysRole) > 0) {

            rst.setCode("success");
            rst.setMessage("添加成功");
        } else {

            rst.setCode("error");
            rst.setMessage("服务器错误");
        }

        return rst;
    }

    @GetMapping("/edit/{id}")
    public String edit(ModelMap map, @PathVariable(name="id") Long id){
        SysRole role = roleService.findById(id);
        map.addAttribute("sysRole",role);
        return "role/edit";
    }

    @PostMapping("/edit/{id}")
    @ResponseBody()
    public AjaxResult edit(@PathVariable(name="id") Long id,@Valid SysRole sysRole, BindingResult result) {
        AjaxResult rst = new AjaxResult();
        if(result.hasErrors()) {
            rst.setCode("error");
            rst.setValidatedResult(result);
            return rst;
        }
        if (sysRole != null) {
            sysRole.setId(id);
            if(roleService.updateRole(sysRole) > 0) {

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

    @PostMapping("/delete")
    @ResponseBody
    public int delete(@RequestParam Long id)
    {
        SysRole role = roleService.findById(id);
        return roleService.deleteRole(role);
    }

    @PostMapping("/batch-delete")
    @ResponseBody
    public int batchDelete(@RequestParam(name="ids[]") Long[] ids)
    {
        if(ids !=null) {
            return roleService.batchDeleteByIds(ids);
        }
        return 0;
    }

    @GetMapping("/list")
    public String list(ModelMap model,@RequestParam Map<String, Object> params){
        Page<SysRole> roles = (Page<SysRole>) roleService.searchAll(params);
        model.addAttribute("params",params);
        model.addAttribute("roles",roles);
        model.addAttribute("totalRecords",roles.getTotal());
        model.addAttribute("totalPages",roles.getPages());
        model.addAttribute("pageNum",roles.getPageNum());

        return "role/list";
    }
}
