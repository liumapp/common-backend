package com.liumapp.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liumapp on 8/23/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap model){
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }

}
