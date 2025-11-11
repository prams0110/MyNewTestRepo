package Tuesday_Aug12;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWebdriver_03 {

	public static void main(String[] args) {
		
		//getAttribute- used to fetch the attribute values from the respective webelement
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement maleradio = driver.findElement(By.id("radio1"));
		String attributevalue = maleradio.getAttribute("type");
		System.out.println(attributevalue);
		
		
		//getTagname- used to fetch the tagname of the particular webelement 
		
		WebElement dropButton = driver.findElement(By.className("dropbtn"));
		String drop = dropButton.getTagName();
		System.out.println(drop);
		
		
		//getLocation - used to fetch the location of the webelement on the web page with respect to X and Y axis
		
		WebElement textarea = driver.findElement(By.id("ta1"));
		Point p = textarea.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println("-----------------------------------------------------------");
		
		//getSize- it fetches the height and width of the webelement on the webpage
		
		WebElement textarea1 = driver.findElement(By.id("ta1"));
		Dimension d = textarea1.getSize();
		System.out.println(d.height); //156
		System.out.println(d.width); //608
		System.out.println("-----------------------------------------------------------");
		
		//getRect - in the selenium v4 we can fetch height , width, x and y axis
		
		WebElement textarea2 = driver.findElement(By.xpath("//div[@id='HTML11']/div[@class='widget-content']/textarea"));
		Rectangle r = textarea2.getRect();
		System.out.println(r.height);
		System.out.println(r.width);
		System.out.println(r.x);
		System.out.println(r.y);
		

	}

}
