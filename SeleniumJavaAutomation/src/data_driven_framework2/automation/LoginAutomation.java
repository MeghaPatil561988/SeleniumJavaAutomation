package data_driven_framework2.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import data_driven_framework2.beans.LoginPage;
import seleniumpracticesessioon.DriverFactory;

public class LoginAutomation {

	public static void fillTheLoginForm(LoginPage loginPage) throws InterruptedException 
	{
		
		System.out.println(loginPage);	
		System.out.println("********************");
		
				
		System.out.println("FIll The Login Form Method()...is called");
		
		
				WebDriver driver = DriverFactory.getWebDriver();
		
				
		
				driver.get("http://www.demo.guru99.com/V4/");

				
				//Step3: call the login function using variables String userName and password
				//String userName = "standard_user";
				//String password = "secret_sauce";
				
				WebElement userNameWebElement = driver.findElement(By.id("user-name"));
				WebElement passwordWebElement = driver.findElement(By.id("password"));
				
				userNameWebElement .sendKeys(loginPage.getUserName());
				Thread.sleep(3000);
				passwordWebElement.sendKeys(loginPage.getPassword());
				Thread.sleep(3000);
				//System.out.println("print");
				
				WebElement loginButtonWebElement = driver.findElement(By.xpath("//input[@id='login-button']"));
				loginButtonWebElement.click();
				//Thread.sleep(3000);
				
				//driver.quit();

				//LoginPage(driver, userName, password);
				
		}
	
	
}
