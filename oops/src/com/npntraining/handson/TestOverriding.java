package com.npntraining.handson;

public class TestOverriding extends Overriding{
	
	public static void main(String[] args) {
		TestOverriding test = new TestOverriding();
		
		Overriding testOver = new TestOverriding(); // This is upcasting
		test.testOverriding();
		testOver.testOverriding();
	}
	//Overriding
	public void testOverriding() {
		System.out.println("This is from child class");
	};
}
