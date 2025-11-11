package Monday_Aug04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFindElement_03 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement checkbox = driver.findElement(By.id("checkb"));
		checkbox.click();
		boolean blue = checkbox.isSelected();
		
		
		if(blue)
		{
			System.out.println("the radio button is selected");
		}else
		{
			System.out.println("the radio button is not selected");
		}
	}

}
