package com.training.testInheritance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritance.Employee;

public class TestEmployee {

Employee employee;
	
	/**
	 * SetUp method for object creation.
	 */
	@Before
	public void setUp() {
		employee = new Employee("Akash", 10000);
		employee.grossSalCalculator();
		employee.netSalCalculator();
	}
	
	/**
	 * Test method for test employee display method.
	 */
	@Test
	public void testEmployeeData() {
		String expected = "Employee ID :-0"+"\n"+ 
				"Employee Name :-Akash"+"\n"+ 
				"Employee Basic Salary :-10000.0"+"\n"+ 
				"Employee Medical :-500.0"+"\n"+ 
				"Employee PF :-1200.0"+"\n"+ 
				"Employee PT :-200.0"+"\n"+ 
				"Employee Gross Salary :-15500.0"+"\n"+ 
				"Employee Net Salary :-14100.0"
				;
		assertEquals(expected, employee.displayEmployeeDetails());
	}
	
	@Test
	public void testCalculateGrossSalMethod() {
		
		assertEquals(15500.0, employee.getGrossSal(),0.02);
		
	}

}
