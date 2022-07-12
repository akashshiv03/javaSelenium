package AmzonAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBCLASS
{
	// 1.data members
	
	@FindBy(id="ap_customer_name") private WebElement userName;
	@FindBy(id="ap_phone_number")private WebElement MobileNumber;
	@FindBy(id="ap_email")private WebElement emailID;
	@FindBy(id="ap_password")private WebElement pass;
	@FindBy(id="continue")private WebElement submit;
	
	//2. constructor
	public FBCLASS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	// PageFactory.initElements(driver, this);
	}
	
	//3. methods
	
	public void sendUserName()
	{
	  userName.sendKeys("AkashShivram");
	}
	public void sendMobileNumber()
	{
		MobileNumber.sendKeys("844622");	
	}
	public void sendemailID()
	{
		emailID.sendKeys("akashivram@gmail.com");
	}
    public void sendpass()
    {
    	pass.sendKeys("Akashk@122333");
    }
    public void clicksubmit()
    {
    	submit.click();
    }

	
	
	

}
