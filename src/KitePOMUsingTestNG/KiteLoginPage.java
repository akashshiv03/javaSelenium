package KitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginPage
{
	// 1.data members
	
 @FindBy(id="userid")private WebElement userName;
 @FindBy(id="password")private WebElement password;
 @FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
 
    //2.Constructor
 public KiteLoginPage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
    //3. methods
public void sendUserName(String UserName)
{
   userName.sendKeys(UserName);	
}
public void sendPassword(String Password)
{
	//password.sendKeys(Password);
	password.sendKeys(Password);

}
public void clickbuttonloginbutton(String Loginbutton)
{
	loginbutton.click();
}
}
