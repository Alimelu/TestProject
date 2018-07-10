package pagelibrary.com.ranford;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Baseclass;

public class Admin_page extends Baseclass{


	public static WebElement Branches_button (WebDriver driver)
	{
		return driver.findElement(getlocator("Branches_button") );
	}
		
	public static WebElement Roles_button (WebDriver driver)
	{
		return driver.findElement(getlocator("Roles_button") );
	}
		
	public static WebElement users_button (WebDriver driver)
	{
		return driver.findElement(getlocator("users_button") );
	}
		
	public static WebElement employee_button (WebDriver driver)
	{
		return driver.findElement(getlocator("employee_button") );
	}
		
	public static WebElement logout_button (WebDriver driver)
	{
		return driver.findElement(getlocator("logout_button") );
	}
		
	

}
