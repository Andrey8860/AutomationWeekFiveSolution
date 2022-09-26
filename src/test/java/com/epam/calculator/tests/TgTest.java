package com.epam.calculator.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {
	
	@Test(dataProvider = "tangentValues", groups = "Trigonometric Functions")
	public void tangentTest(double numberToEvaluate, double expectedResult) {
		Assert.assertEquals(calculator.tg(numberToEvaluate), expectedResult, 
				"Number to evaluate was " + numberToEvaluate + ";");
	}
	
	@DataProvider(name = "tangentValues")
	public Object[][] tangentValues() {
		return new Object[][] {
			{1, 1.5574077246549023},
			{360, -3.380140413960958},
			{-12, 0.6358599286615808},
			{0, 0},
			{-360, 3.380140413960958}
		};
	}
	
}
