package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScroolingUsingSelenium 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//500
         JavascriptExecutor b= (JavascriptExecutor)driver;
		b.executeScript("window.scrollBy(90,800)");
		WebElement katraj = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("arguments[0].scrollIntoView(true)",katraj);
		
		driver.findElement(By.xpath("//a[text()='Start Selenium Practice']")).click();

	}

}
