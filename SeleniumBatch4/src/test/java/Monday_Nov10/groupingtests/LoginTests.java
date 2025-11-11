package Monday_Nov10.groupingtests;

import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority=4 ,groups = {"regression"})
	void LoginbyEmail()
	{
		System.out.println("This is the Login by email");
	}
	
	@Test (priority=5 ,groups = {"regression"})
	void LoginbyFacebook()
	{
		System.out.println("This is the Login by Facebook");
	}
	
	@Test(priority=6 ,groups = {"regression"})
	void LoginbyTwitter()
	{
		System.out.println("This is the Login by Twitter");
	}
}
