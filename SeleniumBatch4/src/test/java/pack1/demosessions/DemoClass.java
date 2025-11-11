package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver(); // that launches the browser instance
        driver.manage().window().maximize();   // maximize the screen 
        driver.get("https://omayo.blogspot.com/"); // Launch the URL or web application
        // locate any element 
        
        WebElement maleradiobutton = driver.findElement(By.id("radio1"));
        maleradiobutton.click();
        Thread.sleep(3000);
        WebElement femaleradiobutton = driver.findElement(By.id("radio2"));
        femaleradiobutton.click();
        
       
        // Sendkeys method 
        
        WebElement textbox = driver.findElement(By.id("ta1"));
        textbox.sendKeys("Hello batch! welcome to selenium!");
        Thread.sleep(3000);
        textbox.clear(); // used to clear the text 
        
        
        
	}

}
