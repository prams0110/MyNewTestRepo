package friday_Oct24_testnNGbasics;

import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Login
	//main method
	//Logout
	
	@Test(priority=30000)
	void logout()
	{
		System.out.println("This is to logout");
	}
	
	@Test(priority=1000)
	void login()
	{
		System.out.println("This is to login");
	}

	@Test(priority=2000)
	void main()
	{
		System.out.println("This is the main method area");
	}
	
	

	
}
