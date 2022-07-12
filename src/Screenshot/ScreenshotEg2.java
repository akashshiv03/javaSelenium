package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEg2
{

	public static void main(String[] args) throws InterruptedException, IOException 
	
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			/*driver.get("https://kite.zerodha.com/");
			
			Thread.sleep(1000);

			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			String str= RandomString.make(4);
			File destination= new File("D:\\Selenium\\Screenshot\\TestScreenshot"+str+".png");
			FileHandler.copy(source, destination);*/
			
			driver.get("https://www.youtube.com");
			Thread.sleep(100);
			File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str1=RandomString.make(4);
			
			File Destination=new File("D:\\Selenium\\Screenshot\\TestScreenshot"+str1+".png");
			FileHandler.copy(source1,Destination);
			
		}
	
	
	

}


