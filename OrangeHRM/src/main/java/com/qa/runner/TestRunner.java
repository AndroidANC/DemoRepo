package com.qa.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features= "E:\\New Workspace\\OrangeHRM\\Feature",  
glue= {"com.qa.stepDefination"}, 
tags={"@login"},
plugin={"html:target/cucumber-html-report"},
monochrome = true, strict = false, dryRun = false )

public class TestRunner 
{
private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
	public void setUpClass() throws Exception{
		testNGCucumberRunner = new TestNGCucumberRunner (this.getClass());	
    }
	
	/*@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method started ");
		TestBase.initialization();
	}*/

	@Test(dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][]features()
	{
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun=true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
	}

}
