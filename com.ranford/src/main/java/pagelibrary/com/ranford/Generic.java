package pagelibrary.com.ranford;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic
{
	public static   Select  dropdownhandle(WebDriver driver,By prop,String exp)
	{
		Select s= new Select(driver.findElement(prop));
		return s;
	}
	
	
	public static   Select  dropdownhandle1(WebDriver driver,By prop,String exp)
		{
			Select s=new Select(driver.findElement(prop));
			
			List<WebElement> option=s.getOptions();
			
			for(WebElement op:option)
			{
				String act=op.getText();
				
				System.out.println(act);
				if(act.contains(exp))
				{
				s.selectByVisibleText(exp);
				break;
				}
			}
			return s;
		}



		

	

}
