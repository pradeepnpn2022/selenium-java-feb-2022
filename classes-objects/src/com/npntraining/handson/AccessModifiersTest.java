package com.npntraining.handson;

public class AccessModifiersTest {
	
	
	// private - with in the class 
	
	// public - with in the project
	
	// default - with in the package
	
	// protected - with in the package and outside also, through child class
	
	public int number;
	String name;
	private long mobile;
	protected String relation;
	
	public void testPublic() {
		System.out.println("This is public method");
	}
	
	private void testPrivate() {
		System.out.println("This is private method");
	}
	
	void testDefault() {
		System.out.println("This is default method");
	}
	
	protected void testProtected() {
		System.out.println("This is protected method");
	}

}

