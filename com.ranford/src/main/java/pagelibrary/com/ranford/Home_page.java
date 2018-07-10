package pagelibrary.com.ranford;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Baseclass;

public class Home_page extends Baseclass{

	public static WebElement username_textbox (WebDriver driver)
	{
		return driver.findElement(getlocator("username_textbox") );
	}

	public static WebElement password_textbox(WebDriver driver)
	{
		
		return driver.findElement( getlocator("password_textbox"));
	}
	
	public static  WebElement login_button(WebDriver driver)
	{
		return driver.findElement( getlocator("login_button"));
	}

}
