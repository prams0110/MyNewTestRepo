package wednesday_sep17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFileUpload {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		// single file uploading
		WebElement choosefiles = driver.findElement(By.id("filesToUpload"));
		choosefiles.sendKeys("D:\\NewSeleniumWorkSpace\\Text1.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("Text1.txt"))
		{
			System.out.println("File is successfully uplaoded");
		}else
		{
			System.out.println("File Upload Failed");
		}
		
	}

}
