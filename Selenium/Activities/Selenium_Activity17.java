package selenium_session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Activity17 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		//go to a web page
		driver.get("https://training-support.net/webelements/selects");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.cssSelector(".h-80"));
		
		Select select = new Select(dropdown);
		
		// Get all the options inside the select as a list
        List<WebElement> allOptions = select.getOptions();
        // Print all the options
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }
		     
		// Select the "HTML" option using the visible text.
		select.selectByVisibleText("HTML");
		
		// Select the 4th, 5th and 6th options using the index.
		select.selectByIndex(4);
		select.selectByIndex(5);
		select.selectByIndex(6);
		
		// Select the "Node" option using the value.
		select.selectByValue("nodejs");
		
        // Get all the options inside the select as a list
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        // Print all the options
        System.out.println("Selected Options in the dropdown: ");
        for(WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }
        
        // De-select the 5th option using index.
        select.deselectByIndex(5);
        
        // Get all the options inside the select as a list
        allSelectedOptions = select.getAllSelectedOptions();
        // Print all the options
        System.out.println("Selected Options in the dropdown: ");
        for(WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }
      
        // Close the browser
        driver.quit();
	}

}
