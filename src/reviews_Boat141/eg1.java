package reviews_Boat141;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.boat-lifestyle.com/products/airdopes-141");
		Thread.sleep(100);
		driver.findElement(By.xpath("//div[@class='sm-close']")).click();
		
		//driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		/*Alert confirmAlert=driver.switchTo().alert();
		//System.out.println(confirmAlert.getText());
		confirmAlert.accept();*/
		
		driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
		Alert confirmAlert=driver.switchTo().alert();
		//System.out.println(confirmAlert.getText());
		confirmAlert.accept();
		
		
		
		
	}

}
