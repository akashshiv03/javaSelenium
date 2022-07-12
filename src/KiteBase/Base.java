package KiteBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base
{
	//protected WebDriver driver;
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		WebDriver driver= new ChromeDriver(opt);
	    WebDriver driver.manage().window().maximize();
	    WebDriver driver.get("https://kite.zerodha.com/");
	}

}
