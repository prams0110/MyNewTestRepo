package thursday_sep18;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
		
		 ChromeDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         driver.get("https://expired.badssl.com/");
         
         
         
         
         System.out.println("Title of the page is : "+driver.getTitle());

	}

}
