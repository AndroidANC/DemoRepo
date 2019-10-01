package com.qa.stepDefination;

import org.openqa.selenium.By;

import com.qa.page.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends TestBase{
	
	public LoginStepDef()
	{
		super();
	}
		
@Given("^user open browser$")
public void user_open_browser() throws Throwable {
	TestBase.initialization();
}

@When("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    System.out.println(driver.getTitle());
}

@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_username_and_password(String username , String Password) throws Throwable {
//    driver.findElement(By.name("txtUsername")).sendKeys(pro.getProperty("username"));
//    driver.findElement(By.name("txtPassword")).sendKeys(pro.getProperty("password"));
    
    driver.findElement(By.name("txtUsername")).sendKeys(username);
    driver.findElement(By.name("txtPassword")).sendKeys(Password);
}

@Then("^user clicks login button$")
public void user_clicks_login_button() throws Throwable {
	driver.findElement(By.name("Submit")).click(); 
}
	

}
