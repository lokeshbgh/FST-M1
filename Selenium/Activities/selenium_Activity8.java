package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_Activity8 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Actions object
        Actions builder = new Actions(driver);

		//go to a web page
		driver.get("https://training-support.net/webelements/mouse-events");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        
        // Perform left click on Cargo.lock and then on Cargo.toml
        builder.click(cargoLock).pause(1000).build().perform();
        
        // Print the front side text
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        builder.moveToElement(cargoToml).pause(1000).click(cargoToml).build().perform();
        
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);

        // Perform double click on src then right click on target
        builder.doubleClick(srcButton).pause(1000).build().perform();
        
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        builder.contextClick(targetButton).pause(1000).build().perform();
        
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        // and then open it
        builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(1000).build().perform();
        
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
			
		//close the browser
		driver.quit();
	}

}
