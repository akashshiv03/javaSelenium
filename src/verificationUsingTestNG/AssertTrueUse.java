package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void method()
  {
	  boolean a=true;
	  boolean b=false;
	  
	//  Assert.assertTrue(a);//we can not take false value because here we use *assertTrue*
	//  Reporter.log("TC is passed value is true ",true);
	  
	  Assert.assertFalse(b);//we can not take false value because here we use *assertFalse*
	  Reporter.log("TC is passed value is true", a);
  }
}
