package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_youtub {

	public static void main(String[] args) throws InterruptedException, IOException
	{
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://vctcpune.com/selenium/practice.html");
		
        Thread.sleep(1000);
        
        File sourc2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destination2=new File("D:\\Selenium\\Screenshot\\myScreenShot3.png"); 
        FileHandler.copy(sourc2, destination2);
        
        File sourc3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Destionation=new File("D:\\Selenium\\Screenshot\\");
        FileHandler.copy(sourc3, Destionation);
        
        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Selenium1\\geckodriver.exe");
		   driver = new FirefoxDriver();

	}

}
