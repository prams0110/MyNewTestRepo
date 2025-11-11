package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_01 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		// handling Frames 
		
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.id("datepicker")); // mm/dd/yyyy
		
		frame1.sendKeys("09/26/2025");
		
		
		

	}

}
