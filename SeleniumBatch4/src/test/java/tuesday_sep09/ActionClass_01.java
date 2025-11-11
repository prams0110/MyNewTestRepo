package tuesday_sep09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		
		// Mouse Hover action
		
		
		/*
		 * WebElement desktoplabel = driver.findElement(By.linkText("Desktops"));
		 * 
		 * WebElement macbooklabel = driver.findElement(By.
		 * xpath("//ul[@class='list-unstyled']/li/a[text()='Mac (1)']"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * act.moveToElement(desktoplabel).build().perform(); Thread.sleep(3000);
		 * 
		 * act.moveToElement(macbooklabel).click().build().perform();
		 * Thread.sleep(3000);
		 * 
		 * driver.close();
		 */
        
		// Right Click action
		
		WebElement rightclickbutton = driver.findElement(By.id("hot-spot"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.contextClick(rightclickbutton).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
        
        
        
        
        
        
	}
	

}
