package selenium_session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class selenium_Activity4 
{
	public static void main(String[] arg)
	{
		//create a WebDriver instance
		WebDriver driver = new FirefoxDriver();
				
		//go to a web page
		driver.get("https://training-support.net/webelements/target-practice");
		
		//do stuff on the page
		System.out.println("Title of the page is : " + driver.getTitle());
		
		//Find the 3rd header and print its text
        //String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
        //System.out.println(thirdHeaderText);
        
		WebElement element = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]"));
		System.out.println("Text on 3rd header is: " + element.getText());
		
		//Find the 5th header and print its color
        Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
        System.out.println("Color as RGB of 5th header is: " + fifthHeaderColor.asRgb());
        System.out.println("Color as hexcode of 5th header is: " + fifthHeaderColor.asHex());
        
		element = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5"));
		System.out.println("Color of 5th header is: " + element.getCssValue("color"));

        //Find the violet button and print its classes
        String purpleButtonClass = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")).getDomAttribute("class");
        System.out.println("classes of violet button is : " + purpleButtonClass);
        
        //Find the grey button and print its text
        System.out.println("text of grey button is : " + driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());

        
		//close the browser
		driver.quit();
	
	}
}
