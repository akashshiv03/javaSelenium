package TestNG_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EGTestNG
{
  @Test
  public void Mymethod()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		
		
  }
  @Test
  public void Display1() throws InterruptedException 
  {
	  
	  Reporter.log("hi Good morning",true);
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='w3-bar-item w3-btn w3-right']]")).click();
  }

}
