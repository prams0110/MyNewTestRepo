package Monday_Nov10.groupingtests;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1, groups = {"sanity"})
	void signupbyEmail()
	{
		System.out.println("This is the signup by email");
	}
	
	@Test(priority=2, groups = {"sanity"})
	void signupbyFacebook()
	{
		System.out.println("This is the signup by Facebook");
	}
	
	@Test(priority=3,groups = {"sanity"})
	void signupbyTwitter()
	{
		System.out.println("This is the signup by Twitter");
	}

}
