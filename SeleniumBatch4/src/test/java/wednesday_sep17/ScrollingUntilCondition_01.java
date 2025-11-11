package wednesday_sep17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUntilCondition_01 {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		// Scroll until element is visible
		JavascriptExecutor js = driver;
		
		WebElement iphoneelement = driver.findElement(By.xpath("//a[text()='iPhone']"));
		
		js.executeScript("arguments[0].scrollIntoView();", iphoneelement); // to scroll until element is visible
		System.out.println(js.executeScript("return window.pageYOffset;")); //880 until element visible
		
	    Thread.sleep(5000);
	    
	    //driver.close();

	}

}
