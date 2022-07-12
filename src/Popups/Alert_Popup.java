package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException
	{
	/*	1. We cannot inspect the elements present in pop up, does not have any colors
		2. These popup will contain ok button or cancel button & Text.
		3. Sometimes these type of popup also contains? or! symbol.*/

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(3000);
		
		alt.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='All Examples']")).click();
		
		
	}

}

