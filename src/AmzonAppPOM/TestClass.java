package AmzonAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D58490306106%26hvpone%3D%26hvptwo%3D%26hvadid%3D486457318205%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5500757864043925177%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007787%26hvtargid%3Dkwd-298187295805%26hydadcr%3D5657_2175734%26gclid%3DCjwKCAjwtcCVBhA0EiwAT1fY7-PzKPL4KpJMD_yUMZQyhR1VoU1__JufQKe7tAm6S2TL1zRm1fk-nhoCImEQAvD_BwE&prevRID=SYAFHPMFKD1Y6JEE2GAX&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		
		FBCLASS login=new FBCLASS(driver);
		
		login.sendUserName();
		login.sendpass();
		login.sendMobileNumber();
		login.sendemailID();
		login.clicksubmit();

	}

}
