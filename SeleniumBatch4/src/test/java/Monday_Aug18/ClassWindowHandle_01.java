package Monday_Aug18;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWindowHandle_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// one window 
       String parenttitle = driver.getTitle();
       System.out.println(parenttitle);
       
       String parentwindowID = driver.getWindowHandle();
       
       Thread.sleep(3000);
       
       WebElement link1 = driver.findElement(By.id("selenium143"));
       link1.click();
       
       //two windows
       Thread.sleep(3000);
       
       Set<String> windowIDs = driver.getWindowHandles();
       
       for(String windowID : windowIDs)
       {
    	 driver.switchTo().window(windowID);   
    	 
    	 if(!windowID.equals(parentwindowID))
    	 {
    		String link2 = driver.getTitle();
    		System.out.println(link2);
    		Thread.sleep(3000);
    		driver.close();
    	 }
    	 
       }
       driver.switchTo().window(parentwindowID); //selenium switches to parent window now
       Thread.sleep(3000);
       WebElement textarea = driver.findElement(By.id("ta1"));
       Thread.sleep(3000);
       textarea.sendKeys("Hello World!");
       Thread.sleep(3000);
       driver.close();
	}

}
