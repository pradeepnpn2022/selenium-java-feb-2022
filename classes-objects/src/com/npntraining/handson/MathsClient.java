package com.npntraining.handson;

public class MathsClient {
	public static void main(String[] args) {
		Maths math = new Maths();
		
		System.out.println("The addition is ::" + math.addition(20, 30));
		System.out.println("The substraction is ::" + math.substraction(20, 30));
		System.out.println("The multiplication is :: "+math.multiplication(20, 30));
		System.out.println("The division is :: "+math.division(20, 30));
	}

}
