package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		
	/*	driver.findElement(By.id("alertBox")).click();
		Alert simpaleAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(simpaleAlert.getText());
		simpaleAlert.accept();

		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmBox")).click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(confirmAlert.getText());
		confirmAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());*/
		
		//driver.findElement(By.id("output")).getText();
		
		Thread.sleep(2000);
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(5000);
		promptAlert.sendKeys("Akash");
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());

		
		
		


	}

}
