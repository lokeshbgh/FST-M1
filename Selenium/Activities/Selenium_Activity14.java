package selenium_session1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Activity14 
{
	public static void main(String[] arg)
	{
		// Driver object reference
	    WebDriver driver = new FirefoxDriver();
	    	
	    // Open the browser
	    driver.get("https://training-support.net/webelements/tables");
	
	    // Verify page title
	    System.out.println("Page title is: " + driver.getTitle());
	    
	    //Find the number of rows and columns in the table and print them.
	    List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
	    System.out.println(row.size());
	    
	    List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
	    System.out.println(cols.size());
	       
	    //Find and print the Book Name in the 5th row.
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book Name in the 5th row before sorting: " + cellValue.getText());
        
        // Sort the table
        driver.findElement(By.xpath("//table/thead/tr/th[5]")).click();
        //driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();

        
        //Find and print the Book Name in the 5th row.
	    cellValue = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println("Book Name in the 5th row after sorting: " + cellValue.getText());
        
	    // Close the browser
	    driver.quit();
	}

}
