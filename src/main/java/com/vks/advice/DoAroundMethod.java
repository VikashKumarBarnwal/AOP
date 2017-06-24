/**
 * 
 */
package com.vks.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author vikumar
 *
 */
public class DoAroundMethod implements MethodInterceptor

{

	/**
	 * 
	 */
	public DoAroundMethod() {
		// TODO Auto-generated constructor stub
	}

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("****SPRING AOP**1** DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		System.out.println("****SPRING AOP***2* DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		System.out.println("****SPRING AOP***3* DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		Object result = methodInvocation.proceed();
		System.out.println("****SPRING AOP***4* DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		System.out.println("****SPRING AOP***5* DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		System.out.println("****SPRING AOP***6* DoArroundiyiyiyiyiyiyiythod : Executing before method!");
		return null;
	}

	/* (non-Javadoc)
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy)
	 */

	/*public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("****SPRING AOP**** DoAroundMethod: Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("****SPRING AOP**** DoAroundMethod: Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));
		
		
		
		
		// same with MethodBeforeAdvice
		System.out.println("****SPRING AOP**** DoAroundMethod: Before method executing!");
		
 
		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();
			// same with AfterReturningAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: After method executing!");
			return result;
 
		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("****SPRING AOP**** DoAroundMethod: When method throws Exception!");
			throw e;
		}
	}
*/
	

}
