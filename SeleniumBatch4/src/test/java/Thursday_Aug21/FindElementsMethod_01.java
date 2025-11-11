package Thursday_Aug21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod_01 {

	public static void main(String[] args) {
		
		// Using for loop for printing the set of links
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		
		
		  List<WebElement> setofLinks = driver.findElements(By.xpath("(//div/ul)[3]"));
		  
//		  for(int i=0;i<setofLinks.size();i++) {
//		  
//		  System.out.println(setofLinks.get(i).getText());
//		  
//		  }
//		  
//		  driver.close();
		 
		

//		for(WebElement links : setofLinks) {
//			
//			System.out.println("Set of links are as follows : "+links.getText());
//			
//		  System.out.println("Set of links are : ");
//			
//		  int i=0;
//		  
//		  while(i<setofLinks.size())
//		  {
//			  System.out.println(setofLinks.get(i).getText());
//			  i++;
//			  
//		  }
//		  driver.close();
		  
		  System.out.println("Set of links are : ");
		  
		  int i=0;
		  
		  do {
			  System.out.println(setofLinks.get(i).getText());
			  i++;
			  
			  } while(i<setofLinks.size());
		  driver.close();
		}
	}


