package TestNGKeyWords;


import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class  InvocationCountUse {
  @Test(invocationCount = 2)
  public void method()
  {
	  Reporter.log("Hello", true);
  }
  @BeforeMethod
  public void Method()
  {
	  Reporter.log("hi", true);
  }
}
