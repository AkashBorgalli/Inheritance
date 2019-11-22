package com.training.inheritance;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public Manager() {
		super();
		
	}
	public Manager(String employeeName, double basicSalary) {
		super(employeeName, basicSalary);
		this.foodAllowance =  basicSalary * 13 / 100;
		this.petrolAllowance = basicSalary * 8 / 100;
		this.otherAllowance = basicSalary * 3 / 100;
		
	}
	
	@Override
	public double grossSalCalculator() {
		double grossSal = super.grossSalCalculator() + this.foodAllowance
				+ this.otherAllowance + this.petrolAllowance;
		super.setGrossSal(grossSal);
		return grossSal;
		
	}
	@Override
	public double netSalCalculator() {
		return super.netSalCalculator();
	}
	@Override
	public String displayEmployeeDetails() {

		return  super.displayEmployeeDetails()
				+ "\n" + "Employee Petrol Allowance :-" + this.petrolAllowance + "\n" + "Employee Food Allowance :-"
				+ this.foodAllowance + "\n" + "Employee Other Allowance :-" + this.otherAllowance;
	}
	
	
}
