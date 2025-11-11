package thursday_sep18;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotMethods_01 {

	public static void main(String[] args) {

           ChromeDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("https://tutorialsninja.com/demo/");
           
			/*
			 * // 1) Take screenshot of the full page using the TakeScreenshot Interface
			 * 
			 * 
			 * TakesScreenshot ts = driver ; // use CTRL+Shift+O to import any packages
			 * 
			 * File sourcefile = ts.getScreenshotAs(OutputType.FILE); // here using the
			 * interface selenium captures the screenshot
			 * 
			 * 
			 * //File Destfile = new File(
			 * "C:\\Users\\PRAMOD\\eclipse-workspace\\SeleniumBatch4\\Screenshots\\fullpage.png"
			 * ); // this is the Hardcoded way File Destfile = new
			 * File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png"); // used
			 * to take the location for saving the file dynamically
			 * 
			 * sourcefile.renameTo(Destfile); // method to move source file to destination
			 * file
			 * 
			 */
	
			
			/*
			 * // 2) take screenshot of a Specific area
			 * 
			 * WebElement featuredproduct =
			 * driver.findElement(By.xpath("(//div[@class='row'])[3]"));
			 * 
			 * 
			 * File sourcefile = featuredproduct.getScreenshotAs(OutputType.FILE); // using
			 * webelement only we take screenshots
			 * 
			 * 
			 * File destfile = new
			 * File(System.getProperty("user.dir")+"\\Screenshots\\featuredprods.png");
			 * 
			 * sourcefile.renameTo(destfile);
			 */
			 

	      // 3) takescreen shot for specific element 
	      
			
			  WebElement logofile =  driver.findElement(By.xpath("//a[text()='Qafox.com']"));
			 
			  File sourcefile = logofile.getScreenshotAs(OutputType.FILE); // using  webelement only we take screenshots
			 
			  File destfile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
			  
			  sourcefile.renameTo(destfile);
			 
	      
	      
	}

}
