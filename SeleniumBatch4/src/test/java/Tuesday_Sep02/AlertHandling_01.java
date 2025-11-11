package Tuesday_Sep02;

import java.io.ObjectInputFilter.Config;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling_01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		 * // Simple alert Handling
		 * 
		 * WebElement simplealert = driver.findElement(By.id("alert1"));
		 * simplealert.click(); Thread.sleep(3000);
		 * 
		 * // alert window pops up
		 * 
		 * Alert alert = driver.switchTo().alert(); // telling selenium to switch to the
		 * alert and handle it
		 * 
		 * Thread.sleep(3000);
		 * 
		 * alert.accept(); // accept is similar to the clicking on ok button
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 */
        
		/*
		 * // Confirmation alert handling
		 * 
		 * WebElement confirmAlert = driver.findElement(By.id("confirm"));
		 * confirmAlert.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * // alert appears
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * // alert.accept(); alert.dismiss();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 */
       
       // Prompt alert
       
       WebElement promptAlert = driver.findElement(By.id("prompt"));
       promptAlert.click();
       
       Thread.sleep(3000);
       
       // alert appears
       
      Alert alert =  driver.switchTo().alert(); 
      
      Thread.sleep(3000);
      
      alert.sendKeys("Pramod");
      
      Thread.sleep(3000);
      
      alert.accept();
      //alert.dismiss();
      
      Thread.sleep(3000);
      
      driver.close();
        
	}

}
