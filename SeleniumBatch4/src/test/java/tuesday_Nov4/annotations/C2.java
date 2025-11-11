package tuesday_Nov4.annotations;


import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {

	@Test(priority=2)
	void xyz()
	{

		System.out.println("This is the xyz method from class C2");
	}

	@AfterTest
	void at()
	{
		System.out.println("This is after Test method");
	}
}
