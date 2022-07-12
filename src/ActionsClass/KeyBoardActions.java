package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions 
{

	public static void main(String[] args) throws InterruptedException
	{  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		WebElement textBox = driver.findElement(By.id("autocomplete"));
		//textBox.sendKeys("Akash Shivram"); 
		Actions act=new Actions(driver);
		act.sendKeys(textBox, "Akash Shivram").perform();
		Thread.sleep(2000);
		WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
	
		act.click(dropDown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();


	}

}
