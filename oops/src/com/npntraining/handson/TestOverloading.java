package com.npntraining.handson;

public class TestOverloading extends Overloading{
	
	public static void main(String[] args) {
		TestOverloading test = new TestOverloading();
		System.out.println(test.addition(10, 20));
		System.out.println(test.addition(10, 20, 30));
		System.out.println(test.addition(10, 20, 30, 40));
	}

}
