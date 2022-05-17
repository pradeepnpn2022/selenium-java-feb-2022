package com.npntraining.handson;

import java.util.Scanner;

public class VoterTest extends VoterValidation{

	public static void main(String[] args) throws NotEligibleToVoteException {
		VoterTest test = new VoterTest();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age::");
		int userAge = scan.nextInt();
		try {
			test.checkVoter(userAge);
		} catch(NotEligibleToVoteException exception) {
			System.out.println(exception);
			
		}
		
	}
	
}
