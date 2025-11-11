package friday_sep19;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OptionsClassIncognitoMode_01 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito"); // This method it will allow you to launch the application in incognito mode
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // to remover the captions on the browser
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
		
		

	}

}
