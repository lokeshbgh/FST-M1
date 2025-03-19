package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_Activity10 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Actions object
        Actions builder = new Actions(driver);

		//go to a web page
		driver.get("https://training-support.net/webelements/drag-drop");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement input = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
		//WebElement football = driver.findElement(By.id("ball"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"dropzone1\"]"));
		//target = driver.findElement(By.id("dropzone1"));
		
        // Perform left click on Cargo.lock and then on Cargo.toml
		builder.clickAndHold(input).pause(1000).dragAndDrop(input, target).pause(1000).build().perform();
		//builder.clickAndHold(input).moveToElement(target).pause(1000).release().build().perform();
		
		if(target.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }
        
        target = driver.findElement(By.xpath("//*[@id=\"dropzone2\"]"));
      //target = driver.findElement(By.id("dropzone2"));
        
        // Perform left click on Cargo.lock and then on Cargo.toml
		builder.dragAndDrop(input, target).pause(1000).build().perform();
        
		if(target.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }
                
		//close the browser
		driver.quit();
	}

}
