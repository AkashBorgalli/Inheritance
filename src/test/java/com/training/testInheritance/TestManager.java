package com.training.testInheritance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.inheritance.Employee;
import com.training.inheritance.Manager;

public class TestManager {

Employee manager;
	
	@Before
	public void setUp() {
		manager = new Manager("Akash", 10000);
	}
	
	/**
	 * Test method for gross salary calculator
	 */
	@Test
	public void testGrossSalaryCalculation() {
		assertEquals(17900.0, manager.grossSalCalculator(),0.02);
	}
	
	/**
	 * Test method for net salary calculator
	 */
	@Test
	public void testNetSalaryCalculation() {
		
		assertEquals(16500.0, manager.netSalCalculator(),0.02);
	}
	
	@After
	public void clear() {
		manager = null;
	}
}
