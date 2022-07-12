package Selenium_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondpro {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

	}

}
