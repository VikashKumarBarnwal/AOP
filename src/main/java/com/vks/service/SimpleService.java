/**
 * 
 */
package com.vks.service;

/**
 * @author vikumar
 *
 */
public class SimpleService {

	/**
	 * 
	 */
	
	
	
	private String name;

	private int id;
	
	public SimpleService() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printNameId() {
		System.out.println("SimpleService : Method printNameId() : My name is " + name
			 + " and my id is " + id);
	}

	public void checkName() throws Exception {
		try {
			if (name.length() < 20) {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
	}

	public void sayHello(String message){
		System.out.println("SimpleService : Method sayHello() : Hello! " + message);
	}

}
