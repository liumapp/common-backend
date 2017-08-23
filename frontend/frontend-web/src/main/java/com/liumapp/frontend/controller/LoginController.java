package com.liumapp.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by liumapp on 8/23/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
