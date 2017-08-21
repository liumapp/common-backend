package com.liumapp.common.security.config;

import com.liumapp.common.security.csrf.CookieCsrfTokenRepository;
import com.liumapp.common.security.csrf.CsrfAutoInterceptor;
import com.liumapp.common.security.csrf.CsrfTokenRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Order
@Configuration
public class SecurityAutoConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public CsrfTokenRepository csrfTokenRepository() {
		return new CookieCsrfTokenRepository();
	}
	
	@Bean
	public CsrfAutoInterceptor csrfInterceptor() {
		CsrfAutoInterceptor csrfInterceptor = new CsrfAutoInterceptor();
		return csrfInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(csrfInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
	}
}
