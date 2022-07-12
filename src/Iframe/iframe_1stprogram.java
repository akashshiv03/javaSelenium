package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_1stprogram
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='w3-bar-item w3-btn w3-right']]")).click();
		
	/*	driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(1000);
		driver.switchTo().frame("Frame1");

		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("akash");*/
		
		//WebElement element=driver.findElement(By.xpath("//button[@type()='Click Me!']"));
		//System.out.println(element.isEnabled());
         
		
	/*	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(1000);
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();*/

	}

}
