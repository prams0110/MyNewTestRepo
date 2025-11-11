package pack1.demosessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationClass_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.navigate().to("https://www.flipkart.com/"); // navigates to flipkart
		
		Thread.sleep(5000);
		
		driver.navigate().back(); // navigates back to omayo
		
		Thread.sleep(5000);
		
		driver.navigate().forward(); // navigates forward to flipkart
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
