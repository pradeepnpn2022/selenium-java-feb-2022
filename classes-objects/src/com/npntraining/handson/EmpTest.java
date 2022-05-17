package com.npntraining.handson;

public class EmpTest extends EmployeeImpl{
	
	public static void main(String[] args) {
		EmpTest test = new EmpTest();
		test.setEmpNo(100);
		test.setEmpName("Sai");
		
		System.out.println("Employee number is :: " + test.getEmpNo());
		System.out.println("Employee name is :: " + test.getEmpName());
	}

}
