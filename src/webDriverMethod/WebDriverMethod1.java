package webDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod1 {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8446226927");
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("844622622927");
		
		//driver.get("https://vctcpune.com/selenium/practice.html");
		
		//driver.findElement(By.xpath("//input[@value='Radio2']")).click();
		
		String text=driver.findElement(By.xpath("//button[text()='Log In']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
	//	WebElement element=driver.findElement(By.xpath("//button[text()='Log In']"));
		//System.out.println(element.isEnabled());
		
		
		
		
	}

	

	}


