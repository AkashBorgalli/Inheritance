package com.training.inheritance;

public class Employee {

private int employeeId;
private String employeeName;
private double basicSalary, HRA, PF;
private double medical = 500;
private double PT = 200;
private double netSal, grossSal;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getBasicSalary() {
	return basicSalary;
}
public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}
public double getHRA() {
	return HRA;
}
public void setHRA(double hRA) {
	HRA = hRA;
}
public double getPF() {
	return PF;
}
public void setPF(double pF) {
	PF = pF;
}
public double getMedical() {
	return medical;
}
public void setMedical(double medical) {
	this.medical = medical;
}
public double getPT() {
	return PT;
}
public void setPT(double pT) {
	PT = pT;
}
public double getNetSal() {
	return netSal;
}
public void setNetSal(double netSal) {
	this.netSal = netSal;
}
public double getGrossSal() {
	return grossSal;
}
public void setGrossSal(double grossSal) {
	this.grossSal = grossSal;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String employeeName, double basicSalary) {
	super();
	this.employeeName = employeeName;
	this.basicSalary = basicSalary;
	this.HRA = basicSalary / 2;
	this.PF = basicSalary * 12 / 100;
}
public double grossSalCalculator() {
	this.grossSal = this.basicSalary + this.HRA + this.medical;
	return this.grossSal;
}


public double netSalCalculator() {
	double netSal = grossSalCalculator() - (this.PF + this.PT);
	this.setNetSal(netSal);
	return netSal;
}
public String displayEmployeeDetails() {
	return "Employee ID :-" + this.employeeId + "\n" + "Employee Name :-" + this.employeeName + "\n"
			+ "Employee Basic Salary :-" + this.basicSalary + "\n" + "Employee Medical :-" + this.medical
			+ "\n" + "Employee PF :-" + this.PF + "\n" + "Employee PT :-" + this.PT + "\n"
			+ "Employee Gross Salary :-" + this.grossSal + "\n" + "Employee Net Salary :-" + this.netSal;
};

}
