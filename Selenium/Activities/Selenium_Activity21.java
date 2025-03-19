package selenium_session1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity21 
{
	public static void main(String[] arg) throws InterruptedException
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
		//go to a web page
		driver.get("https://training-support.net/webelements/tabs");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		// Store the handle of the current tab in a variable
		// This will help you find the newly opened tab later.
		String parentHandle = driver.getWindowHandle();
		
		// Print the handle of the parent window
        System.out.println("Current tab: " + parentHandle);
        System.out.println("Current Page message: " + driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2")).getText());
        
		// Find the button to open a new tab and click it.
		driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/button")).click();
		
		// Wait for the new tab to open. Once it opens, print all the handles.
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		// Switch to the newly opened tab, print the new tab's title and message.
		// Print all window handles
		Set<String> handles = driver.getWindowHandles();
        System.out.println("Currently open windows: " + handles);
        
        // Switch focus to the latest tab
        for (String handle : handles) {
        	if (handle != parentHandle) {
        		driver.switchTo().window(handle);
        	}
        }
        
		// Wait for the new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
        
        // Print the handle of the current tab
        parentHandle = driver.getWindowHandle();
        System.out.println("Current tab: " + parentHandle);
        
        // Print the title and heading of the new page
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h2")).getText());
        
        // Repeat the steps by clicking the button in the new tab page
        // Find and click the button on page to open another tab
        driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        
        handles = driver.getWindowHandles();
        System.out.println("Currently open windows: " + handles);
        
        // Switch focus to the latest tab
        for (String handle : handles) {
        	if (handle != parentHandle) {
        		driver.switchTo().window(handle);
        	}
        }
        
        parentHandle = driver.getWindowHandle();
        System.out.println("Current tab: " + parentHandle);
        
        // Print the title and heading of the new page
        System.out.println("New Page title: " + driver.getTitle());
        System.out.println("New Page message: " + driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/h2")).getText());
        
		
		// Close the browser
        driver.quit();
	}
}
