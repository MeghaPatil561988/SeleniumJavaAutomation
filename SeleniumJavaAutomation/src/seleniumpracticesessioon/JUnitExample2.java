package seleniumpracticesessioon;

import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumpracticesessioon.DriverFactory;

// Login functionality using TestNG
public class JUnitExample2 
{
	
	
	
	@Test
	public void loginFunctionalityTest() throws InterruptedException 
	{
		WebDriver driver =DriverFactory.getWebDriver();
		String url="https://www.saucedemo.com";
		//Step1: Open Web Browser using DriverFactory
	
		
		// Step2: Open the the web-application URL: https://www.saucedemo.com/


		
		//Step3: call the login function using variables String userName and password
		driver.get(url);
	    String userName="standard_user";
	    String password="secret_sauce";

        login(driver,userName,password);
	    driver.close();

	}

	public static void login(WebDriver driver,String userName, String password) throws InterruptedException
	{
		WebElement usernameele;
		WebElement passwordele;
		WebElement loginele;
		
		usernameele=driver.findElement(By.id("user-name"));
		usernameele.sendKeys(userName);;
		passwordele=driver.findElement(By.id("password"));
		passwordele.sendKeys(password);
	    Thread.sleep(5000);
	    loginele=driver.findElement(By.id("login-button"));
	    loginele.click();

	   Thread.sleep(2000);
	    
		
	}
	
		
}