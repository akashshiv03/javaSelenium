package TestNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = 0)
  public void A()
  {
	  Reporter.log("a", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("B", true);
  }
  @Test(priority = 2)
  public void C()
  {
	  Reporter.log("C", true);
  }
  @Test(priority = -1)
  public void D()
  {
	  Reporter.log("D", true);
  }
  @Test(priority = -2)
  public void E()
  {
	  Reporter.log("E", true);
  }
}
