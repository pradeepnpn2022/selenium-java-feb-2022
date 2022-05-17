package com.npntraining.handson;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpNo(1099);
		emp.setEmpName("Pradeep");
		emp.setEmpAge(35);
		emp.setEmpSal(10000);

		System.out.println("Employee number is :: " + emp.getEmpNo());
		System.out.println("Employee name is :: " + emp.getEmpName());
		System.out.println("Employee age is :: " + emp.getEmpAge());
		System.out.println("Employee salary is :: " + emp.getEmpSal());

	}
}
