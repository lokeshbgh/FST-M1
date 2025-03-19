package selenium_session1;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_Activity1 
{

	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		//go to a web page
		driver.get("https://training-support.net");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		//Find the About Us link and click it
		//driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.xpath("/html/body/div/main/div/div/main/a")).click();
		
        // Print the page title of the About Us page
        System.out.println("New page title is: " + driver.getTitle());
		
		//close the browser
		driver.quit();
	}
}