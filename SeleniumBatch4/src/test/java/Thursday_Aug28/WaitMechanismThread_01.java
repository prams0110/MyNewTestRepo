package Thursday_Aug28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMechanismThread_01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownbutton = driver.findElement(By.className("dropbtn"));
		dropdownbutton.click();
		
		//Thread.sleep(20000);
		
		WebElement Flipkartoption = driver.findElement(By.linkText("Flipkart"));
		Flipkartoption.click();
		
		driver.quit();
		

	}

}
