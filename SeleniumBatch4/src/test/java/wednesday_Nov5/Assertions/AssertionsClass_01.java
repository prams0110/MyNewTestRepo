package wednesday_Nov5.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsClass_01 {

	@Test
	void assertion()
	{
		String a = "Flipkart";
		String b = "Flipcart";
		
		
		  if(a.equals(b))
			  
		  { 
			  System.out.println("They are true"); 
			  Assert.assertTrue(true);
		  
		  }else
			  
		  {
			  
		  System.out.println("They are false");
		  Assert.assertTrue(false);
		  
		  }
		 
		
		
		
	}
	
}
