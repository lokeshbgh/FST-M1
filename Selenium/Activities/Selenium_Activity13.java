package selenium_session1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Selenium_Activity13 
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
	    
	    //Find and print all the cell values in the third row of the table.
	    List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
	    
	    System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }
	    
	    //Find and print the cell value at the second row second column.
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());

	    // Close the browser
	    driver.quit();
	}

}
