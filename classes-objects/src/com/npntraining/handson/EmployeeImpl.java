package com.npntraining.handson;

public class EmployeeImpl implements EmployeeInterface{

	private int empNo;
	private String empName;
	@Override
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
		
	}

	@Override
	public void setEmpName(String empName) {
		this.empName = empName;
		
	}

	@Override
	public int getEmpNo() {
		
		return empNo;
	}

	@Override
	public String getEmpName() {
		return empName;
	}

}
