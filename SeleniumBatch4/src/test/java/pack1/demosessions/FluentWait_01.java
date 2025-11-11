package pack1.demosessions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_01 {

	public static void main(String[] args) {

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownbtn = driver.findElement(By.className("dropbtn"));
		dropdownbtn.click();
		
		 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(2L))
			       .pollingEvery(Duration.ofSeconds(1L))
			       .ignoring(NoSuchElementException.class); // TimeOut Exception 

			   WebElement flipkartbtn = wait.until(new Function<WebDriver, WebElement>() {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.linkText("Flipkart"));
			     }
			   });

			   flipkartbtn.click();
	}

}
