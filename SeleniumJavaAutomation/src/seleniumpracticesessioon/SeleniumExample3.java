package seleniumpracticesessioon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Write the Login Automation using variables and WebElements
public class SeleniumExample3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Megha\\\\eclipse-workspace\\\\SeleniumJavaAutomation\\\\lib\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	    String userName="standard_user";
	    String password="secret_sauce";

        login(driver, userName,password);
	    driver.close();
	}

	public static void login(WebDriver driver, String userName, String password) throws InterruptedException
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
