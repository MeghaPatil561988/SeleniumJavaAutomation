package seleniumpracticesessioon;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



//Add two items in the shopping cart and checkout
public class SeleniumExample5 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		//Step1: Open Web Browser using DriverFactory
		WebDriver driver = DriverFactory.getWebDriver();
		
		// Step2: Open the the web-application URL: https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");

		
		//Step3: call the login function using variables String userName and password
		String userName = "standard_user";
		String password = "secret_sauce";

		login(driver, userName, password);
		
		// click add to cart on Backapck
		
		WebElement Backpack;
		Backpack=driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
		Backpack.click();
		
	

		// click add to cart on Bike Light
		WebElement BikeLight;
		BikeLight=driver.findElement(By.xpath("//body[@class='main-body']//div[@id='inventory_container']//div[@id='inventory_container']//div[2]//div[3]//button[1]"));
		BikeLight.click();


		
		// view the cart by clicking on the shopping cart icon
		WebElement shoppingCartWebElement = driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path"));     
		shoppingCartWebElement.click(); 
		
		Thread.sleep(3000);

		 // click on the checkout button
        WebElement checkoutButtonWebElement = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]"));
        checkoutButtonWebElement.click();
 
        Thread.sleep(3000);
        
        // Fill the form: Checkout:Your information and click on 'Continue' button
        String firstName = "John";
        String lastName = "Doe";
        String postalCode = "411057";
        WebElement firstNameWebElement = driver.findElement(By.id("first-name"));
        firstNameWebElement.sendKeys(firstName);
        WebElement lastNameWebElement = driver.findElement(By.id("last-name"));
        lastNameWebElement.sendKeys(lastName);
        WebElement postalCodeWebElement = driver.findElement(By.id("postal-code"));
        postalCodeWebElement.sendKeys(postalCode);
        
        Thread.sleep(3000);
        
        WebElement continueButtonWebElement = driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input"));
        continueButtonWebElement.click();
        
        Thread.sleep(3000);
        
        // click on 'Finish' button
        WebElement finishButtonWebElement = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]"));
        finishButtonWebElement.click();
 
		
        Thread.sleep(3000);
		
		
		
		

driver.close();
	}

	public static void login(WebDriver driver, String userName, String password) {

		WebElement userNameWebElement = driver.findElement(By.id("user-name"));
		WebElement passwordWebElement = driver.findElement(By.id("password"));
		WebElement loginButtonWebElement = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]"));
		
		userNameWebElement.sendKeys(userName);
		passwordWebElement.sendKeys(password);
		System.out.println("on login button");
		loginButtonWebElement.click();
	

	
	}
}
