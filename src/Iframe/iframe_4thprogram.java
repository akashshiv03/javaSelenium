package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_4thprogram {

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium1\\Chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
      Thread.sleep(1000);
      System.out.println(driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText());

     driver.switchTo().frame("frame1");
     String text2=driver.findElement(By.xpath("//b[@id='topic']")).getText();
     System.out.println(text2);
     System.out.println(driver.findElement(By.xpath("//b[@id='topic']")).getText());
      
      driver.findElement(By.xpath("//input[1]")).sendKeys("akash");
      driver.switchTo().frame("frame3");
      driver.findElement(By.xpath("//input[@type='checkbox']")).click();
      
      driver.switchTo().frame("frame2");
      driver.findElement(By.className("col-lg-3"));
      
      

      
	}

}
