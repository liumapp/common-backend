package com.liumapp.common.security.auth;

/**
 * Thrown if an {@link org.springframework.security.core.Authentication Authentication}
 * object does not hold a required authority.
 *
 * @author Ben Alex
 */
public class AccessDeniedException extends RuntimeException {
	// ~ Constructors
	// ===================================================================================================
	
	private static final long serialVersionUID = -8522847765339352735L;

	/**
	 * Constructs an <code>AccessDeniedException</code> with the specified message.
	 *
	 * @param msg the detail message
	 */
	public AccessDeniedException(String msg) {
		super(msg);
	}

	/**
	 * Constructs an <code>AccessDeniedException</code> with the specified message and
	 * root cause.
	 *
	 * @param msg the detail message
	 * @param t root cause
	 */
	public AccessDeniedException(String msg, Throwable t) {
		super(msg, t);
	}
}