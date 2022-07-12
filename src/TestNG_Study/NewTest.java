package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test (priority=1)
  public void C()
  {
	  Reporter.log("login success",true);
  }
  @Test (priority=0)
  public void A()
  {
	  Reporter.log("login success",true);  
  }

  @Test(priority=1)
  public void B()
  {
	  Reporter.log("login success",true); 
  }

}
