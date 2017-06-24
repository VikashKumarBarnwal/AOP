/**
 * 
 */
package com.vks.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author vikumar
 *
 */
public class DoBeforeMethod implements MethodBeforeAdvice {

	/**
	 * 
	 */
	public DoBeforeMethod() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {

		 System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
	}

}
