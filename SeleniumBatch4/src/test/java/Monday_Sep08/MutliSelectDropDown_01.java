package Monday_Sep08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MutliSelectDropDown_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownList = driver.findElement(By.id("multiselect1"));
		//dropdownList.click();
		
		Select multipledropdowns = new Select(dropdownList);
		
		List<WebElement> multiselectList = multipledropdowns.getOptions();

		for(WebElement multiselect : multiselectList)
		{
			System.out.println(multiselect.getText());
		}
		
		multipledropdowns.selectByIndex(0); // Volvo
		Thread.sleep(3000);
		multipledropdowns.selectByValue("Hyundaix"); // Hyundai
		Thread.sleep(3000);
		multipledropdowns.selectByVisibleText("Audi"); // Audi
		Thread.sleep(3000);
		
		multipledropdowns.deselectByVisibleText("Audi");
		Thread.sleep(3000);
		
		List<WebElement> selectedoptions = multipledropdowns.getAllSelectedOptions();
		
		for(WebElement finalselectedlist : selectedoptions)
		{
		System.out.println("The cars that are purchased by Santosh are : "+finalselectedlist.getText());
		}
		
		driver.close();
	
	}

}
