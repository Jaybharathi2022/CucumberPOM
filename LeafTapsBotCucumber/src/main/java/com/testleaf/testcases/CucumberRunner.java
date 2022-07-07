package com.testleaf.testcases;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/com/testleaf/features/MergeLeads.feature", glue = "com/testleaf/pages", monochrome = true)
public class CucumberRunner extends ProjectSpecificMethods {

	/*
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios();
	 * 
	 * }
	 */

}