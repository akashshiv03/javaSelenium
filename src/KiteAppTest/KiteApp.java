package KiteAppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteApp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement Pass = driver.findElement(By.id("password"));
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		
		userID.sendKeys("ELR321");
		Pass.sendKeys("Dhana1111");
		sub.click();
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement con = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		con.click();
		
		WebElement userName = driver.findElement(By.xpath("//span[@class='user-id']"));
		
				
				String actualUserID = userName.getText();
				String expectedUserID="ELR321";
				if(actualUserID.equals(expectedUserID))
				{
				System.out.println("User ID matching TC is PASSED");
				}
				else {
				System.out.println("User ID not matching TC is FAILED");
				}
				userName.click();
				Thread.sleep(100);
				driver.findElement(By.xpath("//a[@target='_self']")).click();
				Thread.sleep(3000);
				driver.close();
				}
				}
