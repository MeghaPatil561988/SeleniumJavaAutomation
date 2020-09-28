package seleniumpracticesessioon;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelReader1 
{

	public static void main(String[] args) throws Exception 
	{
	
		String filePath = "C:\\Users\\Megha\\eclipse-workspace\\SeleniumJavaAutomation\\src\\seleniumpracticesessioon\\LoginDetails.xlsx";    
	       
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        
        int numberOfRows = workbook.getSheet("Sheet1").getLastRowNum();
        for(int i=1; i<=numberOfRows; i++) 
        {
            String userName = workbook.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
            String password = workbook.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
            login(null, userName, password);
           
        }
      		
     

     }
	
        public static void login(WebDriver driver, String userName, String password)
        {
        	 // Step1: Open Web Browser using DriverFactory
            WebDriver driver1 = DriverFactory.getWebDriver();
     
            // Step2: Open the the web-application URL: https://www.saucedemo.com/
            String url = "https://www.saucedemo.com/";
            driver1.get(url);
     
            // Step3: call the login function using variables String userName and password
     
            // Step3: Enter userName
            WebElement userNameWebElement = driver1.findElement(By.id("user-name"));
            userNameWebElement.sendKeys(userName);
     
            // Step4: Enter password
            WebElement passwordWebElent = driver1.findElement(By.id("password"));
            passwordWebElent.sendKeys(password);
     
            // Step5: Click on LOGIN button
            WebElement loginButtonWebElement = driver1.findElement(By.id("login-button"));
            loginButtonWebElement.click();
            
           // System.out.println("login times"+userName);
           // System.out.println("login times"+password);
            driver1.quit();
     
        }
	}
	
	

