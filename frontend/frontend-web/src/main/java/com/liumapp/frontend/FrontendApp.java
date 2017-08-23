package com.liumapp.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liumapp on 8/23/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@SpringBootApplication(scanBasePackages = {"com.liumapp"} )
public class FrontendApp {

    public static void main(String[] args) {
        SpringApplication.run(FrontendApp.class , args);
    }

}
