package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods2 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html"); 
		
		//close: to close the current tab of the browser opened by Selenium tool.
		
		//driver.close();

		//quit: to close the all the tabs present in browser opened by Selenium tool.
		
		//driver.quit();
		
		//driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
  //navigate: this method is use to open an application, move forward, backward & refresh the webpage.
		
		driver.navigate().to("https://www.google.com/");
		
	    //driver.navigate().back();
		
		//Thread.sleep(100);
		//Thread.sleep(100)
		
	    //driver.navigate().forward();
		
	    //driver.navigate().refresh();
		
		//getTitle
		
		System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url------------------------->
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getCurrentUrl());
	


	}

}
