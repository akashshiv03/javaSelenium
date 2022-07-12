package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableUse {
  @Test
  public void f()
  {
	  Reporter.log("f", true);
	  
  }
  @Test
  public void a()
  {
	  Reporter.log("a", false);
	  
  }
  @Test(enabled = false)
  public void b()
  {
	  Reporter.log("b", true);
	  
  }
}
