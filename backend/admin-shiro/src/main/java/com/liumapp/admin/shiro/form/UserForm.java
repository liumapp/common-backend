package com.liumapp.admin.shiro.form;

import com.liumapp.common.validation.NullOrLength;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class UserForm {

    private Long id;

    @NotNull(message="用户名不能为空")
    @Length(min=6,message="用户名至少{min}个字符")
    private String username;

    @NotNull(message="邮箱不能为空")
    @Email(message="邮箱格式不正确")
    private String email;

    @NotNull(message="密码不能为空",groups={CreateUser.class})
    @Length(min=6,max=12,message="密码长度至少6个字符,最多12个字符",groups={CreateUser.class})
    @NullOrLength(message="密码长度至少6个字符,最多12个字符",groups={EditUser.class})
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public interface CreateUser {}

    public interface EditUser {}
}
