package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver(); // that launches the browser instance
        driver.manage().window().maximize();   // maximize the screen 
        driver.get("https://omayo.blogspot.com/"); // Launch the URL or web application
        
        // difference between Close() and quit() methods
        WebElement link1 = driver.findElement(By.xpath("//a[text()='http://www.Selenium143.blogspot.com']"));
        link1.click();
        
        driver.close(); // it will close only the current window
        
        //driver.quit(); // it will close all the windows irrespective of number of windows open
	}

}
