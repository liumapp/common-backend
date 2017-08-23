package com.liumapp.frontend.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liumapp on 8/23/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@Configuration
@MapperScan("com.liumapp.frontend.shiro.dao")
public class ShiroConfig {

    

}
