package com.npntraining.handson;

public class Blocks {

	public static void main(String[] args) {
		One one = new One();
		
		

	}

}

class One {
	{
		System.out.println("Instance block");
	}
	
	static {
		System.out.println("Static block");
	} 
	
}
