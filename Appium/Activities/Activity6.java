package activity;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.Point;

//import static org.testng.Assert.assertTrue;
import static activity.ActionBase.doSwip;

public class Activity6 
{
	AppiumDriver driver;
	WebDriverWait wait;
	
	//setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException 
	{
		// Desired Capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
		options.noReset();
 
		// Server URL
		URL serverURL = new URI("http://localhost:4723").toURL();
 
		// Driver initialization
		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
 
		// Open Selenium page
		driver.get("https://training-support.net/webelements/sliders");
    }
	
	// Test method
	@Test
	public void volume75Test() {
		// Wait for page to load
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar[@resource-id=\"volume\"]")));
		// Get the size of the screen
		Dimension dims = driver.manage().window().getSize();
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * 0.35), (int) (dims.getHeight() * 0.66));
		Point end = new Point((int) (dims.getWidth() * 0.65), (int) (dims.getHeight() * 0.66));
		// Perform swipe
		doSwip(driver, start, end, 2000);
 
		// Get the volume level
		//String volumeText = driver
		//	.findElement(AppiumBy.xpath("//android.view.View[@text=\"50%\"]"))
		//	.getText();
 
		// Assertions
		//assertTrue(volumeText.contains("75%"));
	}
 
	@Test
	public void volume25Test() {
		// Wait for page to load
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.SeekBar[@resource-id=\"volume\"]")));
		// Get the size of the screen
		Dimension dims = driver.manage().window().getSize();
		System.out.println(dims);
		
		// Set the start and end points
		Point start = new Point((int) (dims.getWidth() * .50), (int) (dims.getHeight() * .66));
		Point end = new Point((int) (dims.getWidth() * .35), (int) (dims.getHeight() * .66));
		// Perform swipe
		doSwip(driver, start, end, 2000);
 
		// Get the volume level
		//String volumeText = driver
		//	.findElement(AppiumBy.xpath("//android.view.View[@text=\"50%\"]"))
		//	.getText();
 
		// Assertions
		//assertTrue(volumeText.contains("25%"));
	}
    
    // Tear down method
    @AfterClass
    public void tearDown() 
    {
        // Close the app
        driver.quit();
    }


}
