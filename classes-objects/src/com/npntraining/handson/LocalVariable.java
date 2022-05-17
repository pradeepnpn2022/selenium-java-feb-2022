package com.npntraining.handson;

public class LocalVariable {
	public static void main(String[] args) {
		Variable test = new Variable();
		test.testMethod();
	}

}

class Variable{
	
	public void testMethod() {
		int number = 1000;
		String name = "My Name";
		System.out.println("My number is ::" + number + " My Name is:: " + name);
	} 
}
