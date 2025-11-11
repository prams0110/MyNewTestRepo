package Monday_Sep01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitMechanismFluent_01 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/");
	    
	    WebElement dropDownButton = driver.findElement(By.className("dropbtn"));
	    dropDownButton.click();
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    	       .withTimeout(Duration.ofSeconds(30L))
	    	       .pollingEvery(Duration.ofSeconds(5L))
	    	       .ignoring(NoSuchElementException.class);

	    	   WebElement flipkartButton = wait.until(new Function<WebDriver, WebElement>() {
	    	     public WebElement apply(WebDriver driver) {
	    	       return driver.findElement(By.linkText("Flipkart"));
	    	     }
	    	   });
	    
	     flipkartButton.click();
	    

	}

}
