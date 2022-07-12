package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popup {

	public static void main(String[] args) throws InterruptedException
	{
	  /*1.	These popups are colorful.
		2.	We can inspect the elements present in pop up.
		3.	As we can inspect element present in popup then using selenium we can handle it & no need to switch.*/

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(("//button[@class='_2KpZ6l _2doB4z']"))).click();
	    
		
	}

}
