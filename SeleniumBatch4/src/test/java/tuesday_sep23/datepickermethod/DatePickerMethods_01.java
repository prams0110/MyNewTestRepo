package tuesday_sep23.datepickermethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerMethods_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		// handle the frame
		
		driver.switchTo().frame(0);
		
		// first method using the sendkeys()
		
		//WebElement dateelement = driver.findElement(By.id("datepicker"));
        //dateelement.sendKeys("05/05/2026"); // accepts the date in the format as mm/dd/yyyy
        
        // method 2 to hadle the calender using the date picker method
		
	    String year = "2027";
	    String month = "October";
	    String date = "10";
	    
        
        driver.findElement(By.id("datepicker")).click();
        
        while(true)
        {
        	String expectedMonth = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-month']")).getText();
        	String expectedYear = driver.findElement(By.xpath("//span[@class= 'ui-datepicker-year']")).getText();
        	
        	if(expectedMonth.equals(month) && expectedYear.equals(year))
        	{
        		break;
        	}
        	
        	// if u r selecting the future dates in the application
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // click on the next button
        	
        	// if u r selecting the past dates in the application
        	//driver.findElement(By.xpath("//span[@class= 'ui-icon ui-icon-circle-triangle-w']")).click(); // clicks on the previous button
        	     
        }
        //select the date once month and year re matching
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']//tbody//tr//td//a"));
        
        for(WebElement dt : allDates)
        {
        	if(dt.getText().equals(date))
        	{
        		dt.click();
        		break;
        	}
        		
        }
         
          
        
	}

}
