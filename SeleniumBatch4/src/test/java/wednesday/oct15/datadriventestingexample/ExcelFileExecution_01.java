package wednesday.oct15.datadriventestingexample;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ExcelFileExecution_01 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// test data file that is excel file
		
		String filepath = System.getProperty("user.dir")+"\\datadrivenfile\\datadriven.xlsx";
		
		int rows = ExcelUtils.getrowcount(filepath,"Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			// read the data from the excel file
			
			String principalvalue = ExcelUtils.getcelldata(filepath, "Sheet1", i,0);
			String rateofinterest = ExcelUtils.getcelldata(filepath, "Sheet1", i,1);
			String period1 = ExcelUtils.getcelldata(filepath, "Sheet1", i,2);
			String period2 = ExcelUtils.getcelldata(filepath, "Sheet1", i,3);
			String frequency = ExcelUtils.getcelldata(filepath, "Sheet1", i,4);
			String exp_matvalue = ExcelUtils.getcelldata(filepath, "Sheet1", i,5);
			
			// send this data to the application
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principalvalue);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select period2drpdwn = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			period2drpdwn.selectByVisibleText(period2);
			
			Select freqdrpdwn = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrpdwn.selectByVisibleText(frequency);
			
			WebElement calbutton = driver.findElement(By.xpath("//div[@class='cal_div']//a[1]"));
			calbutton.click();
			
			// Validation
			
			String act_matvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_matvalue)==Double.parseDouble(act_matvalue))
			{
				System.out.println("Test passed");
				ExcelUtils.setcelldata(filepath, "Sheet1", i, 7, "passed");
				ExcelUtils.fillgreencolor(filepath, "Sheet1", i, 7);
			}else
			{
				System.out.println("Test failed");
				ExcelUtils.setcelldata(filepath, "Sheet1", i, 7, "failed");
				ExcelUtils.fillredcolor(filepath, "Sheet1", i, 7);
			}
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			
		}
		
        driver.quit();
	}

}
