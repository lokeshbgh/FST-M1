package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_Activity7 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
				
		//go to a web page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement element = driver.findElement(By.id("textInput"));
				
		System.out.println("textInput is enabled : " + element.isEnabled());
		System.out.println("textInput TagName : " + element.getTagName());
		
		driver.findElement(By.xpath("//*[@id=\"textInputButton\"]")).click();
		
		System.out.println("textInput is enabled : " + element.isEnabled());
		
		if (!element.isEnabled())
		{
			driver.findElement(By.xpath("//*[@id=\"textInputButton\"]")).click();
		}
		 // Type something in to it
		element.sendKeys("Example text");
        System.out.println(element.getDomProperty("value"));

		
		//close the browser
		driver.quit();
	}

}
