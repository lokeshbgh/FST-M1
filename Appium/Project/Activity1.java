package project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 
{
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException 
    {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);

        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Test method
    @Test
    public void googleTask() throws InterruptedException 
    {      
        //Open the Google Tasks app.
        
        String[] tasklist = new String[] {
        		"Complete Activity with Google Tasks", 
        		"Complete Activity with Google Keep", 
				"Complete the second Activity Google Keep" };

        for (int i = 0; i < 3; i++)
        {
        	// Wait for elements to load
            wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc=\"Create new task\"]")));
            
        	//Click the button to add a new task.
        	driver.findElement(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc=\"Create new task\"]")).click();
    	
        	//Add the following tasks:
        	//	Complete Activity with Google Tasks
        	//	Complete Activity with Google Keep
        	//	Complete the second Activity Google Keep

        	System.out.println("Adding new task : ");
        	// Wait for elements to load
        	wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.tasks:id/add_task_title\"]")));
        
        	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.tasks:id/add_task_title\"]"))
        	.clear();
        	
        	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"com.google.android.apps.tasks:id/add_task_title\"]"))
        	.sendKeys(tasklist[i]);
        
        	//After each task is added, the Save button should be clicked.
        	driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.google.android.apps.tasks:id/add_task_done\"]"))
        	.click();
        
        	System.out.println("Added new task : " + tasklist[i]);
        	
        	Thread.sleep(500);
        }
        
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//com.google.android.material.floatingactionbutton.FloatingActionButton[@content-desc=\"Create new task\"]")));
        
        //assertion to ensure that the note was added. 

    	//Write an assertion to ensure all three tasks have been added to the list.
        List<WebElement> list = driver.findElements(AppiumBy.xpath("//android.support.v7.widget.RecyclerView[@resource-id=\"com.google.android.apps.tasks:id/tasks_list\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView"));
                
        System.out.println("total added task : " + list.size());
        
        //Click on each of the tasks added to strike them out.
        for(WebElement element : list)
        {
        	System.out.println("Name of tasks: " + element.getText());
        }
        
        Assert.assertEquals(list.size(), 3);        
    	
    }


    // Tear down method
    @AfterClass
    public void tearDown() 
    {
        // Close the app
        driver.quit();
    }

}
