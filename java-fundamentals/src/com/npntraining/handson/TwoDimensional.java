package com.npntraining.handson;

public class TwoDimensional {
	public static void main(String[] args) {
		
		int[][] two = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		
		System.out.println("Length of array:: " + two.length);
		
		for (int i=0; i<two.length; i++) {
			for(int j=0; j<two[i].length; j++) {
				System.out.print(two[i][j] + "\t");
				
			}
			System.out.println("");
		}
 		
	}

}
