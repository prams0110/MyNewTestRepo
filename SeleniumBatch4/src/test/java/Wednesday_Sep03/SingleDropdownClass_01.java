package Wednesday_Sep03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownClass_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		// Single Select Drop down 
		
		WebElement singleselect = driver.findElement(By.id("drop1"));
		singleselect.click();
		
		Select dropdownlistElements = new Select(singleselect);
		
		 List<WebElement> dropdownOptions = dropdownlistElements.getOptions();
		 
		 for(WebElement dropoption : dropdownOptions )
		 {
			 System.out.println(dropoption.getText());
		 }
		
		 
		 dropdownlistElements.selectByIndex(1);
		 Thread.sleep(3000);
		 dropdownlistElements.selectByValue("jkl");
		 Thread.sleep(3000);
		 dropdownlistElements.selectByVisibleText("doc 4");
		 Thread.sleep(3000);
		
         String selectedoption = dropdownlistElements.getFirstSelectedOption().getText();
         
         System.out.println("The selected option in the single select dropdown is : "+selectedoption);
         Thread.sleep(3000);
         driver.close();

	}

}
