package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {
	
	@Test(dataProvider = "cosinusValues", groups = "Trigonometric Functions")
	public void cosinusTest(double numberToEvaluate, double expectedResult) {
		Assert.assertEquals(calculator.cos(numberToEvaluate), expectedResult, 
				"Number to evaluate was " + numberToEvaluate + ";");
	}
	
	@DataProvider(name = "cosinusValues")
	public Object[][] cosinusValues() {
		return new Object[][] {
			{0, 1},
			{Math.PI, -1},
			{359, 0.6536208072447929},
			{180, -0.5984600690578581},
			{100, 0.8623188722876839},
			{-1, 0.5403023058681398},
			{-243, -0.4559422758951242},
			{-360, -0.2836910914865273}
		};
	}
	
}
