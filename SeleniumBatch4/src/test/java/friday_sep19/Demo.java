package friday_sep19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement malebutton = driver.findElement(By.id("radio1"));
        System.out.println("The attribute value of the type attribute is : "+malebutton.getAttribute("type"));
		
		
		
	}

}
