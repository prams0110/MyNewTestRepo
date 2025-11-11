package wednesday_sep17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFileUpload {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		// multiple file uploading
		WebElement choosefiles = driver.findElement(By.id("filesToUpload"));
		
		String file1 = "D:\\NewSeleniumWorkSpace\\Text1.txt";
		String file2 = "D:\\NewSeleniumWorkSpace\\Text2.txt";

		choosefiles.sendKeys(file1+"\n"+file2);
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText().equals("Text1.txt")
				&&  driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText().equals("Text2.txt"))
		{
			System.out.println("Both the files are successfully uploaded");
		}else
		{
			System.out.println("Files upload failed");
		}
	}

}
