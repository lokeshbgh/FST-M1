package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	private WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver= new FirefoxDriver();
		driver.get("https://training-support.net");
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@Test(priority = 1)
    public void homePageTest() {
        Assert.assertEquals(driver.getTitle(), "Training Support");
        driver.findElement(By.linkText("About Us")).click();
    }
    
    @Test(priority = 2)
    public void aboutPageTest() {
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

}
