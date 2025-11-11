package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//Alerts handling 
		
		WebElement alertbutton = driver.findElement(By.id("alert1"));
		
		alertbutton.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); // accept acts as "OK" on the web page 
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirm")).click();

		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss(); // dismiss acts as "Cancel" button on the web page 
		
		Thread.sleep(5000);
	
		driver.quit();
		

	}

}
