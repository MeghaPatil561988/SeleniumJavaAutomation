package seleniumpracticesessioon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha\\eclipse-workspace\\SeleniumJavaAutomation\\lib\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.saucedemo.com");
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='login-button']")).click(); 
	   Thread.sleep(2000);
	    driver.close();
	
	}
}
