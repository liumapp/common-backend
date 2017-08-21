package com.liumapp.common.security.handler;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class SecurityExceptionHandler {

	@ExceptionHandler
	public String handleAccessDeniedException(ModelMap model,AccessDeniedException ex) {
		model.addAttribute("message",ex.getMessage());
		return "exception";
	}
}
