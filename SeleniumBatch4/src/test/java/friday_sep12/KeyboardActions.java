package friday_sep12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
	
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://text-compare.com/");
       
       WebElement textbox1 = driver.findElement(By.id("inputText1"));
       textbox1.sendKeys("Hello batch! Welcome to the selenium Sessions");
       
       Thread.sleep(3000);
       
       Actions act = new Actions(driver);
       
       // CTRL+A method to select the text
       act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
       
       Thread.sleep(3000);
       
       // CTRL+C method to copy the text
       
       act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
       
       Thread.sleep(3000);
       
       // TAB to move to the next textbox
       
       act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       
       Thread.sleep(3000);
       
       // CTRL+V method to paste the text
       
       act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
       
       Thread.sleep(3000);
       
       driver.close();
       
       
	}

}
