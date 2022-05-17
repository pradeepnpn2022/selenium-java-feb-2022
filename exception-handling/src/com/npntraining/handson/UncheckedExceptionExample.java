package com.npntraining.handson;

import java.util.Scanner;

public class UncheckedExceptionExample {
	
	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the value:: ");
			
			int userValue = scan.nextInt();
			
			Scanner devided = new Scanner(System.in);
			System.out.println("Enter the value to be devided");
			int dividedByValue = devided.nextInt();
			int data = userValue/dividedByValue;
			System.out.println(data);
		} catch (Exception exception) {
//			System.out.println(exception);
			System.out.println("Exception have been handled");
//			exception.printStackTrace();
		} 
	}

}
