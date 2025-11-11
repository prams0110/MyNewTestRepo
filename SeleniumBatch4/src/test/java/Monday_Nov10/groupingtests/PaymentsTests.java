package Monday_Nov10.groupingtests;

import org.testng.annotations.Test;

public class PaymentsTests {

	@Test(priority= 7, groups = {"sanity,regression,functional"})
	void paymentbyCard()
	{
		System.out.println("This is the payment by Card");
	}
	
	@Test(priority=8 , groups = {"sanity,regression,functional"})
	void paymentbyUPI()
	{
		System.out.println("This is the payment by UPI");
	}
	
}
