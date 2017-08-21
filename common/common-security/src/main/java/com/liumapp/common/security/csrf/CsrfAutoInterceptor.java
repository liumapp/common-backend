package com.liumapp.common.security.csrf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.AccessDeniedException;

public class CsrfAutoInterceptor extends HandlerInterceptorAdapter {
				
	@Autowired 
	private CsrfTokenRepository csrfTokenRepository;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (!(handler instanceof HandlerMethod)) {
			return true;
		}	
		CsrfTokenBean tokenBean = csrfTokenRepository.loadToken(request);
		if(request.getMethod().equalsIgnoreCase("POST") ) {
			if (tokenBean != null) {
				String actualToken = request.getHeader(tokenBean.getHeaderName());
				if (actualToken == null) {
					actualToken = request.getParameter(tokenBean.getParameterName());
				}
				if (!tokenBean.getToken().equals(actualToken)) {
					return renderError(request, response, "CsrfToken not eq!");
				}
			} else {
				return renderError(request, response, "CsrfToken not existed!");
			}
		}

		CsrfTokenBean token;
		if (tokenBean != null) {
			token = tokenBean;
		} else {
			token = csrfTokenRepository.generateToken(request);
			csrfTokenRepository.saveToken(token, request, response);
		}
		
		request.setAttribute(token.getParameterName(), token);
		return true;
	}

	private boolean renderError(HttpServletRequest request, HttpServletResponse response, 
			String message) throws IOException {
		csrfTokenRepository.saveToken(null, request, response);
		throw new AccessDeniedException(message);
	}
	
	
	
}
