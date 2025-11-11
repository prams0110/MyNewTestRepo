package thursday_sep11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		
		/*
		 * // Sliding the element from left to right WebElement sourceSlider =
		 * driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		 * 
		 * Actions act = new Actions(driver);
		 * 
		 * System.out.println("The location of the sourceslider before the action is : "
		 * +sourceSlider.getLocation());
		 * 
		 * act.dragAndDropBy(sourceSlider, 250, 282).build().perform(); // 59 , 282
		 * 
		 * System.out.println("The location of the sourceslider after the action is : "
		 * +sourceSlider.getLocation());
		 * 
		 * driver.close();
		 */
		
		// Sliding the element from right to left  
		
		WebElement destSlider = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));

		Actions act = new Actions(driver);
		
		System.out.println("The location of the sourceslider before the action is : "+destSlider.getLocation()); // 545, 282
		
		act.dragAndDropBy(destSlider, -300 , 282).build().perform(); // 545, 282
		  
		System.out.println("The location of the sourceslider after the action is : "+destSlider.getLocation()); // 244, 282
		  
		Thread.sleep(3000);
		
		  driver.close();
		 
		
		
	}

}
