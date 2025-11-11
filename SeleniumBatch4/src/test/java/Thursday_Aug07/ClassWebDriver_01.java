package Thursday_Aug07;


import org.openqa.selenium.edge.EdgeDriver;

public class ClassWebDriver_01 {

	public static void main(String[] args) {
		
	               EdgeDriver driver = new EdgeDriver();
			       driver.manage().window().maximize();
				   driver.get("https://omayo.blogspot.com/");
			}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//80 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String pagerURL = driver.getCurrentUrl();
		
		System.out.println(pagerURL);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		//driver.close();
		
		driver.quit();
		*/
		

	}


