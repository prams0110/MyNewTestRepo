package Thursday_Aug21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabNewWindow_01 {
	
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// Using new new commands of selenium as WINDOW
		
		Thread.sleep(3000);
		
		String omayowindow = driver.getWindowHandle();
		
		WebElement textarea = driver.findElement(By.id("ta1"));
		textarea.sendKeys("Hello World!");
		
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);// which launches a new window inside the current window which is launched already
		driver.get("https://tutorialsninja.com/demo/");// this will launch the URL in the new window that is opened
		Thread.sleep(3000);
		WebElement searchfield = driver.findElement(By.name("search"));
		searchfield.sendKeys("HP");
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(omayowindow);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
