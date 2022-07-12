package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods
{

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\26th March B\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//get- to enter url in browser or to open an application.
		
		driver.get("https://vctcpune.com/");
		
		//close: to close the current tab of the browser opened by Selenium tool.
		
		driver.close();
		
		//quit: to close the all the tabs present in browser opened by Selenium tool
		
		//driver.quit();
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		//5. navigate: this method is use to open an application, move forward, backward & refresh the webpage.
//		
//	driver.navigate().to("https://www.google.co.in/");
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();

		//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.

		//System.out.println(driver.getTitle());
		
		//String title = driver.getTitle();
		
		//System.out.println(title);
		
		//getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
	
		//System.out.println(driver.getCurrentUrl());
		
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
	
	}

}
	


