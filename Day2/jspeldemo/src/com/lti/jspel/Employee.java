package com.lti.jspel;

public class Employee {
	int empId;
	String employeeName;
	double employeesalary;
	Vehicle v;
	
	
	public Employee(int empId, String employeeName, double employeesalary, Vehicle v) {
		super();
		this.empId = empId;
		this.employeeName = employeeName;
		this.employeesalary = employeesalary;
		this.v = v;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", employeesalary=" + employeesalary
				+ ", v=" + v + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}

}
