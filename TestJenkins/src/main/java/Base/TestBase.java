package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	
	WebDriver driver;

	@BeforeMethod
	public void SetUP()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Drivers for Automation\\chromedriver_win32\\chromedriver.exe"); 
		  driver =  new ChromeDriver();
		  driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void EnterName()
	{
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("varun");
	}
	
	@Test(priority=2)
	public void EnterSurName()
	{
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("varun");
	}
}
