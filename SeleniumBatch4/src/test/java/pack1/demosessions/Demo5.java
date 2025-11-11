package pack1.demosessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textareafield = driver.findElement(By.id("ta1"));
        Rectangle r = textareafield.getRect();
        
        System.out.println(r.x); // gives the x axis value
        System.out.println(r.y); // gives the y axis value
        System.out.println(r.height); // gives the height value
        System.out.println(r.width); // gives the width value
        
        driver.quit();
	}

}
