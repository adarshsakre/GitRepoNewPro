package Automate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import smsGenericUtils.BaseClass;

public class Parallel_Flipkart extends BaseClass
{
	@Test
	public void launch()
	{
		
		//done good
		driver.get("https://www.flipkart.com/");
	}
}
