/**
 * 
 */
package com.vks.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author vikumar
 *
 */
public class DoAfterThrowingExceptionMethod implements ThrowsAdvice {

	/**
	 * 
	 */
	public DoAfterThrowingExceptionMethod() {
		// TODO Auto-generated constructor stub
	}
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("****SPRING AOP**** DoAfterThrowingExceptionMethod : Executing when method throws exception!");
	}

}
