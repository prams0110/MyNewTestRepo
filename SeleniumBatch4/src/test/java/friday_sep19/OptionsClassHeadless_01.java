package friday_sep19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassHeadless_01 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // this will basically launch the headless testing in background
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("Your Store"))
		{
			System.out.println("Testcase passed");
		}else
		{
			System.out.println("Testcase Failed");
		}
		
		driver.close();

	}

}
