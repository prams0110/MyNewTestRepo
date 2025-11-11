package monday_sep15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClass_01 {

	public static void main(String[] args) {
		
           ChromeDriver driver = new ChromeDriver();
		   //WebDriver driver = new ChromeDriver();  // abstraction
	       driver.manage().window().maximize();
	       driver.get("https://testautomationpractice.blogspot.com/");

			
			/*
			 * WebElement namefield = driver.findElement(By.id("name"));
			 * //namefield.sendKeys("Pramod");
			 * 
			 * // Assuming that the send keys method fails and returns a exception // in
			 * that case we need use this JavaScriptExecutor method
			 * 
			 * 
			 * JavascriptExecutor js = driver ; // we cannot create and object for any
			 * interfaces so this way is not possible //JavascriptExecutor js =
			 * (JavascriptExecutor)driver; // typecasting
			 * 
			 * js.executeScript("arguments[0].setAttribute('value','Pramod')",namefield);
			 */
			 
	       
			
			/*
			 * WebElement radiobutton = driver.findElement(By.id("male"));
			 * //radiobutton.click();
			 * 
			 * // Assuming that the click method is not working as expected // we go for the
			 * javascriptExecutor interface
			 * 
			 * 
			 * JavascriptExecutor js = driver; js.executeScript("arguments[0].click()",
			 * radiobutton);
			 */
			 
	}

}
