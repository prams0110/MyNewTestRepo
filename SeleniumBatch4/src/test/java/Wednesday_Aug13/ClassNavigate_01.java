package Wednesday_Aug13;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNavigate_01 {

	public static void main(String[] args) throws InterruptedException {
		
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/"); // currently selenium is focusing on the flipkart
	 
	 

	 // Navigation methods
	 
	 Thread.sleep(3000);
	 driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=5965697956057588384&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062072&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	 // currently the focus is on amazon
	 Thread.sleep(3000);
	 driver.navigate().back(); // no need to mention the URL and currently focus is on Flipkart
	 Thread.sleep(3000);
	 driver.navigate().forward(); // no need to mention the URL and currently focus is on 
	 Thread.sleep(3000);
	 driver.navigate().refresh(); // used to refresh the page 
	 driver.close();
	 
	}

}
