package com.liumapp.common.security.captcha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpSession;
import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.util.Date;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy=Captcha.ValidImageCaptcha.class)
public @interface Captcha {

	String message() default "验证码无效!";
		
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default{};
    
    class ValidImageCaptcha implements ConstraintValidator<Captcha, String> {
    	    	
    	@Autowired
    	private HttpSession session;
    	
    	private String sessionKey;
    	
    	private String timeKey;

		@Override
		public void initialize(Captcha annotation) {
			// TODO Auto-generated method stub
			sessionKey = ImageCaptcha.CaptchaCodeName;
			timeKey = ImageCaptcha.CaptchaTimeName;
		}

		@Override
		public boolean isValid(String captchaCode, ConstraintValidatorContext context) {
			
			Object cko = session.getAttribute(sessionKey);
			if(cko == null) {
				return false;
			}			
			String captcha = cko.toString();
			Date now = new Date();
			Long codeTime = Long.valueOf(session.getAttribute(timeKey).toString());
			if (StringUtils.isEmpty(captchaCode)) {
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate("验证码不能为空");
				return false;
			} else if (!(captchaCode.equalsIgnoreCase(captcha))) {
				return false;
			} else if ((now.getTime() - codeTime)/1000/60>5){
				context.disableDefaultConstraintViolation();
				context.buildConstraintViolationWithTemplate("验证码过期");
				return false;
			} else {
				session.removeAttribute(sessionKey);
				return true;
			}
		}
    	
    }
}
