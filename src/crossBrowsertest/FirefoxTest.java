package crossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest  {
  @Test
  public void myMethod()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium1\\geckodriver.exe");
	  WebDriver driver= new FirefoxDriver();
	  driver.manage().window().maximize();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
      driver= new ChromeDriver();
 	 driver.get("https://www.youtube.com/");

      
  }
}
