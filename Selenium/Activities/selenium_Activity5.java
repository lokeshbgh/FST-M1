package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_Activity5 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
				
		//go to a web page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement element = driver.findElement(By.name("checkbox"));
		System.out.println("Checkbox is visible: " + element.isDisplayed());
		
		System.out.println("Click the Toggle Checkbox button - ");
		driver.findElement(By.xpath("//button[contains(@class, 'svelte-sfj3o4')]")).click();
		//driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
		
		System.out.println("Checkbox is visible: " + element.isDisplayed());
		
		//close the browser
		driver.quit();
	}

}
