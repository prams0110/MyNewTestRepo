package wednesday_sep17;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUntilLastPage_01 {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		   Thread.sleep(3000);
		
		// Scroll until element is visible
		JavascriptExecutor js = driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); //979 last page
		
	    Thread.sleep(5000);
	    
	    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); // scrollback to top of the webpage
	    

	}

}
