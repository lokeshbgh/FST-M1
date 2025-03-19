package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_Activity9 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Actions object
        Actions builder = new Actions(driver);

		//go to a web page
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement input = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1/span"));
        
        //On the page, type out a string from the Selenium script to show on the page
		builder.sendKeys(input, "This is sample text.").pause(1000).build().perform();
        
        //Print the message to the console.
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        //2nd method
        //Press the key
        builder.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
        
        //Print the message to the console.
        String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);
        
		//close the browser
		driver.quit();
	}

}
