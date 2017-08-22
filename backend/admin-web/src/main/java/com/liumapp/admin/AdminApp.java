package com.liumapp.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication(scanBasePackages = {"com.liumapp"} )
public class AdminApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(AdminApp.class, args);
    }

}
