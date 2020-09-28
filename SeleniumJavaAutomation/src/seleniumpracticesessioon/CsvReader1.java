package seleniumpracticesessioon;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CsvReader1 {

	public static void main(String[] args) throws Exception 
	{
		 //String fileName = "LoginDetails.csv";
	       
		String filePath = "C:\\Users\\Megha\\eclipse-workspace\\SeleniumJavaAutomation\\src\\seleniumpracticesessioon\\LoginDetails.xlsx";    
	       
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        FileReader fileReader = new FileReader(filePath);
	        BufferedReader br = new BufferedReader(fileReader);
	        while (br.ready()) {
	            String line = br.readLine();
	            String[] values = line.split(",");
	            String userName = values[0];
	            String password = values[1];
	 
	            System.out.println("userName:" + userName);
	            System.out.println("password:" + password);
	            login(userName, password);
	        }
	}

	private static void login(String userName, String password) throws InterruptedException
	{
		 // Step1: Open Web Browser using DriverFactory
        WebDriver driver = DriverFactory.getWebDriver();
 
        // Step2: Open the the web-application URL: https://www.saucedemo.com/
        String url = "https://www.saucedemo.com/";
        driver.get(url);
 
        // Step3: call the login function using variables String userName and password
 
        // Step3: Enter userName
        WebElement userNameWebElement = driver.findElement(By.id("user-name"));
        userNameWebElement.sendKeys(userName);
 
        // Step4: Enter password
        WebElement passwordWebElent = driver.findElement(By.id("password"));
        passwordWebElent.sendKeys(password);
 
        // Step5: Click on LOGIN button
        WebElement loginButtonWebElement = driver.findElement(By.id("login-button"));
        loginButtonWebElement.click();
 
	}
}
