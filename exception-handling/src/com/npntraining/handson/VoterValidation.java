package com.npntraining.handson;

public class VoterValidation {
	
	public void checkVoter(int age) throws NotEligibleToVoteException {
		
		if(age > 18) {
			System.out.println("Voter is elegible to vote");
		} else {
			throw new NotEligibleToVoteException("User is not eligible to vote");
		}
		
	}

}
