package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();//child window
		Thread.sleep(2000);
		
	//	String mainPageID = driver.getWindowHandle();// id of main page
	//	System.out.println(mainPageID);
		
		Set<String> allpageID=driver.getWindowHandles();
		System.out.println(allpageID);
		
		Iterator<String> t=allpageID.iterator();
		System.out.println(t);
		

	}

}
