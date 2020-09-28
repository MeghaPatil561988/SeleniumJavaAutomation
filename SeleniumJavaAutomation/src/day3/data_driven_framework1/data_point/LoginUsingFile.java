package day3.data_driven_framework1.data_point;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import day3.data_driven_framework1.automation.LoginAutomation;
import day3.data_driven_framework1.beans.LoginPage;


public class LoginUsingFile {
	// Access the file which contains the data (LoginDetails.xlsx)

	public static void main(String[] args) throws Exception {

		//String filePath = "LoginDetails.xlsx";
		String filePath = "C:\\Users\\Megha\\eclipse-workspace\\SeleniumJavaAutomation\\src\\seleniumpracticesessioon\\LoginDetails.xlsx";    
	       
        XSSFWorkbook workbook = new XSSFWorkbook(filePath);
        
        int numberOfRows = workbook.getSheet("Sheet1").getLastRowNum();
        for(int i=1; i<=numberOfRows; i++) 
        {
            String userName = workbook.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
            String password = workbook.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
            //login(driver, userName, password);
            System.out.println(""+userName);
            System.out.println(""+password);
            LoginPage loginpage=new LoginPage(userName,password);
            LoginAutomation.fillTheLoginForm(loginpage);
            
           
        }
		

	}

}
