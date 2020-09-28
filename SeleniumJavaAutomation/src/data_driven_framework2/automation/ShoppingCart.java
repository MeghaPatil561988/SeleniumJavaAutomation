package data_driven_framework2.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumpracticesessioon.DriverFactory;

public class ShoppingCart
{
	public static void fillTheShoppingCartForm() throws InterruptedException
	{
		
		System.out.println("FIll The Shopping Cart Form Method()...is called");
		WebDriver driver = DriverFactory.getWebDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement shoppingcart = driver.findElement(By.cssSelector("#shopping_cart_container > a > svg > path"));
		Thread.sleep(3000);
		shoppingcart.click();
		System.out.println("clicked shopping cart");
		driver.quit();
	}

}
