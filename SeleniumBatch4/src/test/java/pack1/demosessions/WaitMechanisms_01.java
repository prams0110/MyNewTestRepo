package pack1.demosessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMechanisms_01 {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// This is the implicit wait mechanism also called as Global Wait
		// once if u define the implicit wait hen it is applicable to all the elements
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement dropdownbtn = driver.findElement(By.className("dropbtn"));
		dropdownbtn.click();
		
		//Thread.sleep(30000); // Using Java method-- It will wait for the whole amount of seconds that is given 
		
		// Below is the Explicit wait methods and inside this we have a class called as WebdriverWait()
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement flipkartbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		
		flipkartbtn.click();
		
		driver.close();

	}

}