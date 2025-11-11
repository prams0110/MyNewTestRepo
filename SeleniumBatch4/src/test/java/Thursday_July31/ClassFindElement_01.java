package Thursday_July31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFindElement_01 {

	public static void main(String[] args) {
		

		//3 lines of statement that you need to follow
		
		//1 Launch the browser (Chrome, Edge , Firefox , Safari)
		
	     ChromeDriver  driver = new ChromeDriver();
	     
		//2 Maximize or minimize the browser window 
	     
	    driver.manage().window().maximize();
	       
		//3 Launch the Web Application(Webdriver method)
	    
	    driver.get("https://omayo.blogspot.com/"); // one of the webdriver method to launch the URL
	    
	    
	    WebElement maleRadioButton = driver.findElement(By.id("radio1")); // located the element on the webpage
	    maleRadioButton.click(); // using the action to be performed that is click action.
	    
	    WebElement femaleRadioButton = driver.findElement(By.id("radio2"));
	    femaleRadioButton.click();
	    
	    WebElement link = driver.findElement(By.id("link1"));
	    link.click();
	    
	}

}
