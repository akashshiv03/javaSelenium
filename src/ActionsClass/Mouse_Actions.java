package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions
{

	public static void main(String[] args) throws InterruptedException
	{
      
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		//WebElement seleniumButton = driver.findElement(By.linkText("Selenium"));
		//seleniumButton.click();
		
		Actions act=new Actions(driver);
		
		WebElement rightClickButton=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		//act.contextClick(rightClickButton).perform();
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClickButton).perform();

	}

}
