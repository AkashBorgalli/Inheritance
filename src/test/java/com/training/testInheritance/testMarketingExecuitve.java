package com.training.testInheritance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.inheritance.Employee;
import com.training.inheritance.*;

public class testMarketingExecuitve {

Employee MarketingExecutive;
	
	@Before
	public void setUp() {
		MarketingExecutive = new MarketingExecutive("Akash",10000,10);
	}
	
	
	
	/**
	 * Test method for gross salary calculator
	 */
	@Test
	public void testGrossSalaryCalculation() {
		assertEquals(17050.0, MarketingExecutive.grossSalCalculator(),0.02);
	}
	
	/**
	 * Test method for net salary calculator
	 */
	@Test
	public void testNetSalaryCalculation() {
		assertEquals(15650.0, MarketingExecutive.netSalCalculator(),0.02);
	}
	
	@After
	public void clear() {
		MarketingExecutive = null;
	}


}
