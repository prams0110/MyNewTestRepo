package pack1.demosessions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// one window (first window)
		
		WebElement textbox = driver.findElement(By.id("ta1"));
	    textbox.sendKeys("Hello Batch!");
	    
	    WebElement popuplink = driver.findElement(By.linkText("Open a popup window"));
		popuplink.click();
		Thread.sleep(3000);
		
		// second window 
		
		Set<String> windowIDs = driver.getWindowHandles(); // multiple window IDs 1- omayo.blogspot 2- New window
		String newwindowtext = null;
		for(String windowID : windowIDs)
		{
			driver.switchTo().window(windowID);
			String pagetitle = driver.getTitle();
			
			if(pagetitle.equals("New Window"))
			{
				newwindowtext = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
				//String text = newwindowtext.getText();
				Thread.sleep(3000);
			}
		}
		
		
		System.out.println(newwindowtext);
		Thread.sleep(3000);
		driver.close();
		

	}

}
