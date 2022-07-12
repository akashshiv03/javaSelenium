package TestNG_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Method {
	  @Test
	  public void ValidatePin() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuuCyy8UV3jX4aDDF7TAtjAiwUg_EwIVzQwJlRJDkn2ozF4pYHfj3MkaAgnVEALw_wcB");
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("25");
			driver.findElement(By.xpath("//select[@id='day']")).sendKeys("25");
			//driver.findElement(By.xpath())
			driver.findElement(By.xpath("//button[contains(@id,'u_0_10')]")).click();
			
			System.out.println("************************************************************");
	  }
	  
	  @Test
	  public void ValidateUserId() {
		  Reporter.log("UserId Validation done--> @Test used", true);
	  }
	  @BeforeMethod
	  public void EnterUserIdAndPassword() {
		  Reporter.log("UserIdPasswordEntered  done--> @BeforeMethod used", true);
	  }

	  @AfterMethod
	  public void Logout() {
		  Reporter.log("Logout  done--> @AfterMethod used", true);
	  }

	  @BeforeClass
	  public void BrowserLaunch() {
		  Reporter.log("Launch Browser--> @BeforeClass used", true);
	  }

	  @AfterClass
	  public void CloseBrowser() {
		  Reporter.log("Closed Browser--> @AfterClass used", true);
	  }
	  
}
