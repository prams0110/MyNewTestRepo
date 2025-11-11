package monday_Nov3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMClass_01 {

		//Open App --launch the web app
		// Logo test -- validation check the logo
		// Login -- do the login validation
		// logout -- logout from the app
		
	    ChromeDriver driver;
	    @Test(priority=1)
		void openapp()
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	    @Test(priority=2)
		void testlogo() throws InterruptedException
		{
	    	Thread.sleep(3000);
			boolean logoname = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			System.out.println("Logo is present "+ logoname);
		}
		
	    @Test(priority=3)
		void login()
		{
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();	
		}
		
	    @Test(priority=4)
		void logout()
		{
			driver.quit();
		}

	

}
