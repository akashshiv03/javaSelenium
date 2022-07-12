package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//driver.get("https://www.hotstar.com/in/subscribe/sign-in?returnURL=/in/subscribe/my-account");
	}

}
