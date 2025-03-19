package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_Activity2 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
				
		//go to a web page
		driver.get("https://training-support.net/webelements/login-form/");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		//enter credentials in the username and password fields
		
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("password");
		//driver.findElement(By.name("password")).sendKeys("password");
		//driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		
		//driver.findElement(By.linkText("Password")).sendKeys("password"); not working
		
		//click submit button
		//driver.findElement(By.linkText("Submit")).click(); not working
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
	    
	    // Print the page title of the About Us page
	    System.out.println("New page title is: " + driver.getTitle());
	    
	    // Print the confirmation message
        String message = driver.findElement(By.tagName("h1")).getText();
        System.out.println("confirmation message is : " + message);
	    
		//close the browser
		driver.quit();
	
	}
}
