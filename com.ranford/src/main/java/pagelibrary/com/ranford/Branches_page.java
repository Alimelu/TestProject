package pagelibrary.com.ranford;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Baseclass;

public class Branches_page extends Baseclass {


		public static WebElement country_dropdown(WebDriver driver)
		{
		
		return driver.findElement(getlocator("country_dropdown"));
		}
		
		public static WebElement state_dropdown(WebDriver driver)
		{
		
		return driver.findElement(getlocator("state_dropdown"));
		}
		
		public static WebElement city_dropdown(WebDriver driver)
		{
		
		return driver.findElement(getlocator("city_dropdown"));
		}
		
		public static WebElement search_button(WebDriver driver)
		{
		
		return driver.findElement(getlocator("search_button"));
		}
		
		public static WebElement clear_button(WebDriver driver)
		{
		
		return driver.findElement(getlocator("clear_button"));
		}


}
