package com.qa.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testclass extends TestBase {
	
	public Testclass()
	{
		super();
	}
	
	@Test
	public void test1()
	{
		
		initialization();
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "E:\\New Workspace\\OrangeHRM\\Drivers\\chromedriver.exe"); WebDriver driver
		 * = new ChromeDriver();
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * System.out.println(" project setups are up to date");
		 */
	}

}
