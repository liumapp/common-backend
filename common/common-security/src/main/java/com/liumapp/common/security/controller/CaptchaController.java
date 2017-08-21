package com.liumapp.common.security.controller;

import com.liumapp.common.security.captcha.ImageCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;


@Controller
@Validated
public class CaptchaController {
	
	@RequestMapping("/images/captcha")
	@ResponseBody
	public String capcha( HttpSession session, HttpServletResponse response)
			throws Exception {
			
		OutputStream os = response.getOutputStream();
		Map<String, Object> map = ImageCaptcha.getImageCode(60, 20, os);
		String code = map.get(ImageCaptcha.CaptchaCodeName).toString().toLowerCase();
		session.setAttribute(ImageCaptcha.CaptchaCodeName, code);
		session.setAttribute(ImageCaptcha.CaptchaTimeName, (new Date()).getTime());
					
		try {
			ImageIO.write((BufferedImage) map.get("image"), "JPEG", os);
		} catch(IOException e) {
			return "";
		}
		return null;
	}
	
	
	@RequestMapping("/captcha/verify")
	@ResponseBody
	public String checkCode(HttpServletRequest request, HttpSession session) {
		String checkCode = request.getParameter("captcha");
		
		Object cko = session.getAttribute(ImageCaptcha.CaptchaCodeName);
		if(cko == null) {
			return "验证码服务错误!";
		}

		String captcha = cko.toString().trim();
		Date now = new Date();
		Long codeTime = Long.valueOf(session.getAttribute(ImageCaptcha.CaptchaTimeName).toString());
		if (StringUtils.isEmpty(checkCode) || captcha == null) {
			return "请输入验证码!";
		} else if (!(checkCode.equalsIgnoreCase(captcha))) {
			return "验证码错误!";
		} else if ((now.getTime() - codeTime)/1000/60>5){
			return "验证码过期，请刷新后输入!";
		} else {
			session.removeAttribute(ImageCaptcha.CaptchaCodeName);
			return "ok";
		}
	}
}
