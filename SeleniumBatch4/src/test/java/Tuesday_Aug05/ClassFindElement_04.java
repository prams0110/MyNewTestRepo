package Tuesday_Aug05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFindElement_04 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		//getting text from textarea box
		WebElement textbox = driver.findElement(By.xpath("//div[@id='HTML11']//textarea"));
		String text = textbox.getText();
		
		System.out.println(text);
		
		//getting text from the logo
		WebElement logo = driver.findElement(By.className("title"));
		String logotext = logo.getText();
		
		System.out.println(logotext);
		
		//getting text which is on the button
		
		WebElement list = driver.findElement(By.xpath("//div[@id='HTML26']//ul"));
		String unorderedlist = list.getText();
		
		System.out.println(unorderedlist);
	}

}
