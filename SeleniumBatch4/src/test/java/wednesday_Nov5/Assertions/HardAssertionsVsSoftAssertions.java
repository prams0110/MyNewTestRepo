package wednesday_Nov5.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsVsSoftAssertions {
	
	@Test
   void assertcomparisons()
   {
	   
	System.out.println("tesing one");
	System.out.println("tesing two");
	
	//Assert.assertEquals(123,456); //false
	
	SoftAssert a = new SoftAssert();
	
	a.assertEquals(123, 465); 
	
	System.out.println("tesing three");  
	System.out.println("tesing four");
	   
	   
   }

}
