package com.npntraining.handson;

public class Variables {
	String instanceName;
	int instanceId = 10;
	static String myName = "Hello";
	final String TEST_CONST = "This is constant";
	
	public static void main(String[] args) {
		Variables test = new Variables();
		test.testLocalVariables();
		test.test();
	}
	
	public void testLocalVariables() {
		String localName = "NPN";
		int localId = 123;
		
		System.out.println("The local name is :: " + localName);
		System.out.println("The local Id is :: " + localId);
		System.out.println("The instance name is :: "+instanceName);
		System.out.println("The instance id is :: " + instanceId);
	}
	
	public void test() {
		System.out.println("The static variable is :: "+myName);
		System.out.println("The final variable is :: "+ TEST_CONST);
	}
	
	

}
