package selenium_session1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Activity22 
{
	public static void main(String[] arg) throws InterruptedException
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		// Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
		//go to a web page
		driver.get("https://training-support.net/webelements/popups");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		// Find the launcher button and click it
        driver.findElement(By.id("launcher")).click();

        // Wait for the modal to appear
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

        // Find the input fields and Enter the credentials
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        
        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Print the success message
        String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
        System.out.println("Login message: " + message);
		
		// Close the browser
        driver.quit();
	}

}
