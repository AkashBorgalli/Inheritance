package com.training.inheritance;

public class MarketingExecutive extends Employee {
	private int kmTravel;
	private int tourAllowance;
	private int telephoneAllowance = 1500;

	public int getKmTravel() {
		return kmTravel;
	}

	public void setKmTravel(int kmTravel) {
		this.kmTravel = kmTravel;
	}

	public int getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(int tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public int getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(int telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}

	public MarketingExecutive(String name, double basicSalary, int kmTravel) {
		super(name, basicSalary);
		this.kmTravel = kmTravel;
		this.tourAllowance = kmTravel * 5;
		grossSalCalculator();
		netSalCalculator();

	}

	@Override
	public double grossSalCalculator() {
		double grossSal = super.grossSalCalculator() + this.telephoneAllowance + this.tourAllowance;
		super.setGrossSal(grossSal);
		return grossSal;
	}

	@Override
	public double netSalCalculator() {
		return super.netSalCalculator();
	}

	@Override
	public String displayEmployeeDetails() {
		return super.displayEmployeeDetails() + "\n" + "Employee Tour Allowance :-" + this.tourAllowance + "\n"
				+ "Employee Telephone Allowance :-" + this.telephoneAllowance;
	}

}
