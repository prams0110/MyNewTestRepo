package Thursday_Aug14;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWindowHandlers_01 {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//one window (parent window)
		
		WebElement Textarea = driver.findElement(By.id("ta1"));
		Textarea.sendKeys("Hello world!");
		
		WebElement popupWindow = driver.findElement(By.linkText("Open a popup window"));
        popupWindow.click();
        
        Thread.sleep(3000);
        
      //two window (Child window)
        
        Set<String> windowIDS = driver.getWindowHandles();  // windowIDS are stored in variable called WindowIDs
        
        String windowtext =  null;  // declaring initially the value of the text as null 
        for(String windowID : windowIDS ) 
        {
        	
        	driver.switchTo().window(windowID);  // parent or child window we dont know
        	String windowtitle = driver.getTitle(); // omayo blogspot
        	
        	if(windowtitle.equals("New Window"))
        	{
        		 windowtext = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
        		 Thread.sleep(3000);
        		 driver.close();
        	}
        	
        	
        }
        System.out.println(windowtext);
        
	}
        
 }


