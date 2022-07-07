package com.testleaf.testcases;

import org.testng.annotations.DataProvider;

import com.testleaf.base.ProjectSpecificMethods;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/com/testleaf/features", glue = "com/testleaf/pages", monochrome = true)
public class CucumberRunnerParallel extends ProjectSpecificMethods {

	
	  @DataProvider(parallel = true) public Object[][] scenarios() { return
	  super.scenarios();
	  
	  }
	 

}