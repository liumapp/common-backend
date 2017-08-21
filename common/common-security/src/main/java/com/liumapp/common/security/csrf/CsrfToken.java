package com.liumapp.common.security.csrf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Csrf过滤注解
 * Cross-site response forgery 跨站请求伪造
 * @author L.cm
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CsrfToken {
	boolean create() default false;
	boolean remove() default false;
}
