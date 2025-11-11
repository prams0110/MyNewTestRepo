package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver(); // that launches the browser instance
        driver.manage().window().maximize();   // maximize the screen 
        driver.get("https://omayo.blogspot.com/"); // Launch the URL or web application
        
        
       WebElement logo =  driver.findElement(By.className("title"));
       boolean logodisplayed = logo.isDisplayed();
       
       if(logodisplayed)
       {
    	   System.out.println("Logo is displayed on the web application");
       }else
       {
    	   System.out.println("Logo is not displayed on the web application");
       }
       
       System.out.println("-------------------------------------------------------");
       
       WebElement button1 = driver.findElement(By.id("but1"));
       boolean disabledbutton = button1.isEnabled();
       
       if(disabledbutton)
       {
    	   System.out.println("Button is enabled ");
       }else
       {
    	   System.out.println("button is disabled");
       }
       System.out.println("-------------------------------------------------------");
       
       WebElement radiobutton = driver.findElement(By.xpath("//input[@value='Bike']"));
       boolean bikebuttton = radiobutton.isSelected();
       
       if(bikebuttton)
       {
    	   System.out.println("Button is selected");
       }else
       {
    	   System.out.println("Button is not selected");
       }
       
       driver.close(); // it will close only the current window
       
       driver.quit(); // it will close all the windows irrespective of number of windows open
       
	}

}
