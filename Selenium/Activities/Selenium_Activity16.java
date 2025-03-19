package selenium_session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Activity16 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
		
		//go to a web page
		driver.get("https://training-support.net/webelements/selects");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		
		Select select = new Select(dropdown);
		
		// Selecting the third option based on visible text
		select.selectByVisibleText("Two");
		// Print the selected option
        System.out.println("Second option: " + select.getFirstSelectedOption().getText());

		// Select the third option based on Index
		select.selectByIndex(3);
		// Print the selected option
        System.out.println("Third option: " + select.getFirstSelectedOption().getText());

		// Selecting the fourth option based on it's value
		select.selectByValue("four");
		// Print the selected option
        System.out.println("Fourth option: " + select.getFirstSelectedOption().getText());

		// Get all the options inside the select as a list
        List<WebElement> allOptions = select.getOptions();
        // Print all the options
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        
        // Get all the options inside the select as a list
        List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
        // Print all the options
        System.out.println("Selected Options in the dropdown: ");
        for(WebElement option : allSelectedOptions) {
            System.out.println(option.getText());
        }
      
        // Close the browser
        driver.quit();
	}

}
