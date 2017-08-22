package com.liumapp.admin.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liumapp on 8/22/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
public class MainsiteErrorController implements ErrorController {

    private static final String ERROR_PATH = "/error";

    @RequestMapping(value=ERROR_PATH)
    @ResponseBody
    public String handleError(){
        return "403";
    }

    @Override
    public String getErrorPath() {
        // TODO Auto-generated method stub
        return ERROR_PATH;
    }

    @RequestMapping(value="/deny")
    @ResponseBody
    public String handleDeny(){
        return "deny";
    }

    @RequestMapping("/tosignout")
    @ResponseBody
    public String tosso() {
        return "tosignout";
    }

}
