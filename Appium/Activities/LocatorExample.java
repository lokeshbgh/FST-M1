package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;

//import io.appium.java_client.ios.options.XCUITestOptions;

public class LocatorExample 
{
	AppiumDriver driver;
	
	//setup function
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException 
	{
		//desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.calculator2");
        options.setAppActivity(".Calculator");
        options.noReset();
        
        /*//For IOS
        XCUITestOptions iosOptions = new XCUITestOptions();
        iosOptions.setPlatformName("ios");
        iosOptions.setAutomationName("XCUITest");
        iosOptions.setApp("/path/to/app.ipa");
		iosOptions.noReset();*/

        // Server Address
        //URL serverURL = new URL("http://localhost:4723");
        URL serverURL = new URI("http://localhost:4723").toURL();
        
        
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }
	
	// Test method
    @Test
    public void addTest() 
    {
    	//find 5 and tap it
    	//driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_5")).click();
    	driver.findElement(AppiumBy.id("digit_5")).click();
    	
    	//find + symbol and tap it
    	driver.findElement(AppiumBy.accessibilityId("plus")).click();
    	
    	//find 9 and tap it
    	driver.findElement(AppiumBy.id("com.android.calculator2:id/digit_9")).click();
    	
    	//find = symbol and tap it
    	driver.findElement(AppiumBy.accessibilityId("equals")).click();
    	
    	String result = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
    	System.out.println("addtion is : " + result);
    	//assertions
    	assertEquals(result, "14");
    	
    }
    
    // Tear down method
    @AfterClass
    public void tearDown() 
    {
        // Close the app
        driver.quit();
    }
        
}
