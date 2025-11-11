package wednesday_sep17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingByPixel_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		// Scroll by pixel number
		JavascriptExecutor js = driver;
		
		js.executeScript("window.scrollBy(0,700)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
	    Thread.sleep(3000);
	    
	    driver.close();
		

	}

}
