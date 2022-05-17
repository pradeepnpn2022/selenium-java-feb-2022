package com.npntraining.handson;

public class ThisExample {
	
	int empNo;
	String empName = "Ravi";
	
	public ThisExample(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
		System.out.println(empNo);
		System.out.println(empName);
	}
	
	public void setEmpNo(int empNo) {
		empNo = empNo;
	}
	
	public String setEmpName(String empName) {
		return empName = empName;
	}
	
	
	public static void main(String[] args) {
		ThisExample test = new ThisExample(10, "test");
		
	}

}
