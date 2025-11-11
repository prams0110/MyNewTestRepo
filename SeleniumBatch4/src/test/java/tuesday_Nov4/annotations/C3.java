package tuesday_Nov4.annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test(priority=3)
	void pqr()
	{

		System.out.println("This is the pqr method from class C3");
	}
	
	@BeforeSuite
	void beforesuite()
	{
	 System.out.println("This is before suite method");	
	}
	
	@AfterSuite
	void aftersuite()
	{
		System.out.println("This is after suite method");
	}
}
