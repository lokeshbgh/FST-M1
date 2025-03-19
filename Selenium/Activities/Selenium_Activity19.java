package selenium_session1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity19 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
		//go to a web page
		driver.get("https://training-support.net/webelements/alerts");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		// Find the button to open a CONFIRM alert and click it.
		driver.findElement(By.id("confirmation")).click();
		 
		// Wait for the alert to be displayed
		wait.until(ExpectedConditions.alertIsPresent());
		 
		// Switch the focus from the main window to the Alert box 
		Alert alert = driver.switchTo().alert();
		 
		// get the text in it and print it.
		System.out.println("Text in alert: " + alert.getText());
		 
		// Click the OK button on the alert
		alert.accept();

		// Print the message
        System.out.println(driver.findElement(By.id("result")).getText());
        
		// Find the button to open a CONFIRM alert and click it.
		driver.findElement(By.id("confirmation")).click();
		 
		// Wait for the alert to be displayed
		wait.until(ExpectedConditions.alertIsPresent());
		 
		// Switch the focus from the main window to the Alert box 
		alert = driver.switchTo().alert();
		 
		// get the text in it and print it.
		System.out.println("Text in alert: " + alert.getText());
		 
		// Click the Cancel button on the alert
		alert.dismiss();

		// Print the message
        System.out.println(driver.findElement(By.id("result")).getText());

        // Close the browser
        driver.quit();
	}


}
