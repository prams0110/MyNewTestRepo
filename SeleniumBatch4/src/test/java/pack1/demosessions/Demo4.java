package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver(); // that launches the browser instance
        driver.manage().window().maximize();   // maximize the screen 
        driver.get("https://omayo.blogspot.com/"); // Launch the URL or web application
        
        
        // getText() - used to fetch any text from the web application 
        
        String textbox = driver.findElement(By.xpath("//div[@id='HTML11']//div//textarea")).getText();
     
        System.out.println(textbox);
        
        // getTitle() - it fethces the title of the page
        
        String title = driver.getTitle();
        
        System.out.println(title);
        
        // getCurrentURL - use to fetch the url of the current window
        
        String pageurl = driver.getCurrentUrl();
        
        System.out.println(pageurl);
        
        // getPageSource() - used to fetch the page source of the app
        
       String pageSource = driver.getPageSource();
       
       System.out.println(pageSource);
        
        driver.quit();
        
	}

}
