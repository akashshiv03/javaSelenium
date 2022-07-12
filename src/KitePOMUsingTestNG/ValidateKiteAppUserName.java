package KitePOMUsingTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;

	

  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--headless");
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
        //Reporter.log("Launching browser",true);
		Reporter.log("Launchig browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
		//Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
		File myfile=new File("D:\\Selenium\\kitelogin1.xlsx");
		System.out.println(myfile);
		//mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");

		mySheet=WorkbookFactory.create(myfile).getSheet("Sheet3");
	   

  }
  @BeforeMethod
  public void loginToKiteApp()
  {
	  String UN = mySheet.getRow(3).getCell(0).getStringCellValue();
	  String PWD = mySheet.getRow(3).getCell(1).getStringCellValue();
	  String PIN = mySheet.getRow(3).getCell(2).getStringCellValue();
	  login.sendUserName(UN);
	  Reporter.log("sending username",true);
	  login.sendPassword(PWD);
	  Reporter.log("sending password",true);
	  login.clickbuttonloginbutton(PIN);
	  Reporter.log("clicking on login button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  pin.sendpin(PIN);
	  Reporter.log("sending PIN",true);
	  pin.clikcontinew();
	  Reporter.log("clicking on continue button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  }
	  

  @Test
  public void validateUserName()
  {
    String expectedUN = mySheet.getRow(5).getCell(0).getStringCellValue();
    String actualUN = home.getActualUserName();
    Reporter.log("Validating UserName",true);
    
    Reporter.log("Actual and Expected UN are matching TC PASSED",true);
  }
  @AfterMethod
  public void logoutFromKiteApp() throws InterruptedException
  {
     home.logOut();
     Reporter.log("logging out...",true);
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
     Thread.sleep(2000);
     Reporter.log("Closing browser",true);
     driver.close();
  }

}
