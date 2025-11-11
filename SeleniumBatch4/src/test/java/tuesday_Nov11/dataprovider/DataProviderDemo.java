package tuesday_Nov11.dataprovider;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DataProviderDemo {
  
	ChromeDriver driver;
	
	@BeforeClass
	void Setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	@Test
	void LoginTest()
	{
		
	}
	
	@AfterClass
	void LogoutTest()
	{
		driver.quit();
		
	}
}
