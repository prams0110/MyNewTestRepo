package tuesday_Nov4.annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAnnotations {
	
	// login
	// search
	// logout
	
	// login
	// Adv Search 
	// logout
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is login before test method");
	}

	@Test(priority=1)
	void search()
	{
		System.out.println("This is search validation");
	}
	
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("This is advance search validation");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout after test method");
	}
}
