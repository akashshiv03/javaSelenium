package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNulluse {
  @Test
  public void method() 
  {
	  String a="null";
	  String b="XYZ";
	  
	//  Assert.assertNull(b);
	//  Reporter.log("value is not null TC is passed",true);
	  
	  Assert.assertNull(b);//b is not null value so here in out *test case shows failure*
	  Reporter.log(a, true);
	  Assert.fail();
	  
	  
  }
}
