package tuesday_Nov4.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotations2 {

	    // login
		// search
		// Adv Search 
		// logout
		
		@BeforeClass
		void login()
		{
			System.out.println("This is login before test method");
		}
		
		@AfterClass
		void logout()
		{
			System.out.println("This is logout after test method");
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
	
}
