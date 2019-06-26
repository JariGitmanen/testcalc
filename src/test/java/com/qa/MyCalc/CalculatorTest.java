package com.qa.MyCalc;


import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {


	@Test
	public void SubtractTwoNumbersTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(4,2);
		Assert.assertEquals(2, result);
	}
}