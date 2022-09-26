package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {
	
	@Test(dataProvider = "cotangentValues", groups = "Trigonometric Functions")
	public void cotangentTest(double numberToEvaluate, double expectedResult) {
		Assert.assertEquals(calculator.ctg(numberToEvaluate), expectedResult, 
				"Number to evaluate was " + numberToEvaluate + ";");
	}
	
	@DataProvider(name = "cotangentValues")
	public Object[][] cotangentValues() {
		return new Object[][] {
			{1, 0.642093},
			{360, -0.295846},
			{-12, 1.572673},
			{0, Double.POSITIVE_INFINITY},
			{-360, 0.295846}
		};
	}
	
}
