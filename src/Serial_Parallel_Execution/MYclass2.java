package Serial_Parallel_Execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MYclass2 {
  @Test
  public void Method2()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
	  RemoteWebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }
}
