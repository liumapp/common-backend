package com.liumapp.common.result;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liumapp on 8/21/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class AjaxResult {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setValidatedResult(BindingResult result) {
        if(result != null && result.hasErrors()) {
            List<String> msgs = new ArrayList<String>();
            List<ObjectError> errors = result.getAllErrors();
            for(ObjectError error : errors) {
                msgs.add(error.getDefaultMessage());
            }
            setMessage(String.join(",", msgs));
        }
    }


}

