package KitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage
{
	//1
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath ="//button [type='submit']")private WebElement submitbutton;
	
	//2
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	//method
	public void sendpin(String Pin)
	{
		pin.sendKeys(Pin);
	}
	public void clikcontinew()
	{
		submitbutton.click();
	}
 
}
