package KiteTes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppPOM.KiteLoginPage;
import KiteBase.Base;
import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KitePinPage;
import KiteUtility.Utility;

public class ValidateKiteUserIDUingProperty extends Base {
	 
private static final String UtilityProp = null;
KiteHomePage home;
KiteLoginPage login;
KitePinPage pin;
String TCID="555";
@BeforeClass
public void launchBrowser()
{
  openBrowser();
  login= new KiteLoginPage(driver);
  pin= new KitePinPage(driver);
  home= new KiteHomePage(driver);
}
@BeforeMethod
public void loginToKiteApp() throws EncryptedDocumentException, IOException
{
  login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
  login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
  login.clickOnLoginButton();
  pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
  pin.clikcontinew();
}
@Test
 public void validateUserID() throws EncryptedDocumentException, IOException
{
  Assert.assertEquals(home.getActualUserName(),UtilityProp.getDataFromPropertyFile("UN"));
  Utility.captureScreenshot(driver, TCID);
}
@AfterMethod
public void logOutFromKite() throws InterruptedException
{
  home.logOut();
}
@AfterClass
public void closeBrowser()
{
//driver.close();
	driver.close();
}
}
