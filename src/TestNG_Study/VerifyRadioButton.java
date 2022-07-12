package TestNG_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.Test;



public class VerifyRadioButton {
  @Test
  public void Method()
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement radioButton2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
		radioButton2.click();
		//radioButton2.isDisplayed();
		
	/*	if(radioButton2.isSelected())
		{
			Reporter.log("TC pass Radio Button is selected",true);
		}
		else
		{
			Reporter.log("TC failed RadioButton is not selected",true);
		}*/
		//Assert.assertTrue(radioButton2.isSelected(),"Radio button is not selected TC is failed");
	
  }
  
}
