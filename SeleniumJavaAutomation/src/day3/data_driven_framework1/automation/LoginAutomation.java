package day3.data_driven_framework1.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day3.data_driven_framework1.beans.LoginPage;
import seleniumpracticesessioon.DriverFactory;

public class LoginAutomation {

	public static void fillTheLoginForm(LoginPage loginPage) throws InterruptedException
	{
		/* write the selenium code to open the browser and fill the login form
		 * using LoginPage object -->Page Object Model
		 */
				
		System.out.println("FIll The Login Form Method()...is called");
		
		//Step1: Open Web Browser using DriverFactory
				WebDriver driver = DriverFactory.getWebDriver();
		
				
		// Step2: Open the the web-application URL: https://www.saucedemo.com/
				driver.get("https://www.saucedemo.com/");

				
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
				driver.quit();

				//LoginPage(driver, userName, password);
				
	}

	/*private static void LoginPage(WebDriver driver, String userName, String password)
	{
		
		
	}*/
}
