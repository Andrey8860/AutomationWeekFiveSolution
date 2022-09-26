package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseTest {
	
	@Test(dataProvider = "sineValues", groups = "Trigonometric Functions")
	public void cosinusTest(double numberToEvaluate, double expectedResult) {
		Assert.assertEquals(calculator.sin(numberToEvaluate), expectedResult, 
				"Number to evaluate was " + numberToEvaluate + ";");
	}
	
	@DataProvider(name = "sineValues")
	public Object[][] sineValues() {
		return new Object[][] {
			{0, 0},
			{359, 0.7568221986283603},
			{180, -0.8011526357338304},
			{100, -0.5063656411097588},
			{-1, -0.8414709848078965},
			{-243, 0.8900093488562771},
			{-360, -0.9589157234143065}
		};
	}
	
}
