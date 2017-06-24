/**
 * 
 */
package com.vks.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author vikumar
 *
 */
public class DoAfterReturningMethod implements AfterReturningAdvice {

	/**
	 * 
	 */
	public DoAfterReturningMethod() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void afterReturning(Object arg0, Method arg1, Object[] arg2,
			Object arg3) throws Throwable {

		System.out.println("****SPRING AOP**** DoAfterReturningMethod : Executing after method return!");
	}

}
