package com.liumapp.admin.shiro.controller;

import com.github.pagehelper.Page;
import com.liumapp.admin.shiro.model.SysPermission;
import com.liumapp.admin.shiro.service.SysPermissionService;
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
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private SysPermissionService permissionService;

    /**
     * 查询所有的权限
     *
     * @return
     */
    @GetMapping("/list")
    public String SelectAllPer(ModelMap model, @RequestParam Map<String, Object> params) {
        Page<SysPermission> Permission = (Page<SysPermission>) permissionService.SelectAllPer(params);
        model.addAttribute("params", params);
        model.addAttribute("Permission", Permission);
        model.addAttribute("totalRecords", Permission.getTotal());
        model.addAttribute("totalPages", Permission.getPages());
        model.addAttribute("pageNum", Permission.getPageNum());
        return "permission/list";

    }

    @RequestMapping("/add")
    public String add(SysPermission sysPermission) {

        return "permission/add";

    }

    /**
     * 添加权限
     *
     * @return
     */
    @PostMapping("/add")
    @ResponseBody()
    public AjaxResult add(@Valid SysPermission sysPermission, BindingResult result) {
        AjaxResult rst = new AjaxResult();
        if (result.hasErrors()) {
            rst.setCode("error");
            rst.setValidatedResult(result);
            return rst;
        }

        if (permissionService.savePermission(sysPermission) > 0) {
            rst.setCode("success");
            rst.setMessage("添加成功");
        } else {
            rst.setCode("error");
            rst.setMessage("添加失败");
        }
        return rst;

    }

    /**
     * 删除权限
     *
     * @param id
     * @return
     */
    @PostMapping("/delete")
    @ResponseBody()
    public int delect(@RequestParam Long id, ModelMap model) {
        SysPermission permission = permissionService.findByPermissionId(id);
        return permissionService.delectPer(permission);
    }

    /**
     * 编辑权限
     */
    @GetMapping("edit/{id}")
    public String edit(@PathVariable(name = "id") Long id, ModelMap model) {
        SysPermission sysPermission = permissionService.findByPermissionId(id);
        model.addAttribute("sysPermission", sysPermission);
        return "permission/edit";

    }

    @PostMapping("edit/{id}")
    @ResponseBody()
    public AjaxResult edit(@PathVariable(name = "id") Long id, @Valid SysPermission sysPermission,
                           BindingResult result) {
        AjaxResult res = new AjaxResult();
        if (result.hasErrors()) {
            res.setCode("error");
            res.setMessage("编辑失败");
            return res;
        }
        if (sysPermission != null) {
            sysPermission.setId(id);
        }
        if (permissionService.edit(sysPermission) > 0) {
            res.setCode("success");
            res.setMessage("编辑成功");
        }
        return res;

    }

    @RequestMapping("batch-delete")
    @ResponseBody()
    public int batchDelete(@RequestParam(name="ids[]") Long ids[]) {
        int i=0;
        for (Long long1 : ids) {
            i=permissionService.delectByfId(long1);
        }
        return i;
    }
}
