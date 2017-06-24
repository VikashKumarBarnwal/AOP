/**
 * 
 */
package com.vks.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vks.service.SimpleService;

/**
 * @author vikumar
 *
 */
public class MainApp {

	/**
	 * 
	 */
	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SimpleService simpleService1 = (SimpleService) context.getBean("simpleServiceBean1");
		simpleService1.printNameId();
		
		simpleService1.setId(100);
		
		
		System.out.println(simpleService1.hashCode());
		
		SimpleService simpleService2 = (SimpleService) context.getBean("simpleServiceBean1");
		simpleService2.printNameId();
		System.out.println(simpleService2.hashCode());
		/*System.out.println("--------------");
		try{
			simpleService.checkName();
		} catch(Exception e){
			System.out.println("SimpleService: Method checkName() exception thrown..");
		}
		System.out.println("--------------");
		simpleService.sayHello("Javacodegeeks");*/
		context.close();
	}

}
