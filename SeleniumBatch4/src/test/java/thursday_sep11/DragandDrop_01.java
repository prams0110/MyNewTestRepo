package thursday_sep11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_01 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		// Drag and drop action
		driver.switchTo().frame(0); // switch to the frame
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		
		WebElement dropElement = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
		act.dragAndDrop(dragElement, dropElement).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
