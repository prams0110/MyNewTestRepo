package Friday_Aug29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait_01 {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Global wait
		
		WebElement dropdownbutton = driver.findElement(By.className("dropbtn"));
        dropdownbutton.click();
       
        WebElement Flipkartoption = driver.findElement(By.linkText("Flipkart"));
		Flipkartoption.click();
		
		
	}

}
