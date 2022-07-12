package Dropdown_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuuCyy8UV3jX4aDDF7TAtjAiwUg_EwIVzQwJlRJDkn2ozF4pYHfj3MkaAgnVEALw_wcB");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("");	
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shivram");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akash123@gmail.com");
		
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("30");
        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jun");
        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2022");*/
		
		
		Thread.sleep(1000);
		
		
		/*WebElement b_day = driver.findElement(By.name("birthday_day"));
	    Select s1=new Select(b_day);
	    s1.selectByIndex(3);
	   
	    

		WebElement b_month = driver.findElement(By.name("birthday_month"));
	    Select s2=new Select(b_month);
	    s2.selectByValue("7");
	    

		WebElement b_year = driver.findElement(By.name("birthday_year"));
	    Select s3=new Select(b_year);
	    s3.selectByVisibleText("2020");*/
	    
		//driver.get("https://demoqa.com/select-menu");
		//driver.findElement(By.id='oldSelectMenu');
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		
		WebElement mutliSelectElement = driver.findElement(By.name("cars"));

		Select s= new Select(mutliSelectElement);
		
		System.out.println("Multi Select status is "+s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		Thread.sleep(100);
		s.selectByValue("saab");
		Thread.sleep(100);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByIndex(3);
		
		//s.deselectAll();
		Thread.sleep(100);
		s.deselectByIndex(3);
		Thread.sleep(100);
		s.deselectByIndex(2);
		Thread.sleep(100);
		s.deselectByValue("saab");
		
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		s.getAllSelectedOptions();
	}

}
		

	


