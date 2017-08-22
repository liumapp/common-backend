package com.liumapp.admin.form;

import com.liumapp.common.security.captcha.Captcha;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by liumapp on 8/22/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class LoginForm {

    @NotEmpty(message="用户名不能为空")
    private String username;

    @NotEmpty(message="密码不能为空")
    @Length(min=6, message="密码长度不能少于6位")
    private String password;

    @Captcha
    private String captcha;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

}
