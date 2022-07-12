package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException
	{
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
        Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File destination= new File("D:\\Selenium\\Screenshot\\myScreenShot1.png");
		
		FileHandler.copy(source,destination);
		
		driver.get("https://www.youtube.com/");
		
		File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination1=new File("D:\\Selenium\\Screenshot\\myScreenShot.png");
		FileHandler.copy(source1, destination1);
		
		

	}

}