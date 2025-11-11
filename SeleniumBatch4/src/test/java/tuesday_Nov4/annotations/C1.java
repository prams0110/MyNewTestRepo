package tuesday_Nov4.annotations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
@Test(priority=1)
void abc()
{

	System.out.println("This is the abc mrthod from class C1");
}

@BeforeTest
void bt()
{
	System.out.println("This is before Test method");
}


}
