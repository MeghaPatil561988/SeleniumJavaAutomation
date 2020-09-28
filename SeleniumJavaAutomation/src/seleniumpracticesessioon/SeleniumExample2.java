package seleniumpracticesessioon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Write the Login Automation using separate login function
public class SeleniumExample2 
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

		driver.findElement(By.id("user-name")).sendKeys(userName);;
	    driver.findElement(By.id("password")).sendKeys(password);;
	    Thread.sleep(5000);
	    driver.findElement(By.id("login-button")).click();

	   Thread.sleep(2000);
	    //driver.close();
		
	}
}
