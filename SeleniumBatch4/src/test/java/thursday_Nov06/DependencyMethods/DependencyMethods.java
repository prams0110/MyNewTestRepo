package thursday_Nov06.DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority=1)
	void OpenApp()
	{
		System.out.println("This is the openApp method");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods={"OpenApp"})
	void Login()
	{
		System.out.println("This is the Login method");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods={"Login"})
	void Search()
	{
		System.out.println("This is the Search method");
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods={"Login"})
	void AdvSearch()
	{
		System.out.println("This is the AdvSearch method");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods={"Login"})
	void Logout()
	{
		System.out.println("This is the Logout method");
		Assert.assertTrue(true);
	}
}
