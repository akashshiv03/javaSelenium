package webTable;





import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eg2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.sggs.ac.in/home/page/Tenders-Site-Section");
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalNumOfRows = rows.size();
		System.out.println("Total number of rows in table "+totalNumOfRows);
		
	//List<WebElement>=driver.findElements(By.xpath("//table//th"));
	
	List<WebElement> col = driver.findElements(By.xpath("//table//th"));
	int totalNumOfcol =col.size();
	System.out.println("Total number of rows in table "+totalNumOfcol);
	
	
	List<WebElement> allrowsdata=driver.findElements(By.xpath("//table//tr"));
	Iterator<WebElement>tr=allrowsdata.iterator();
    while(tr.hasNext())
    {
		System.out.print(tr.next().getText());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		}	
  /*  List<WebElement> allcoldata=driver.findElements(By.xpath("//table//th"));
	Iterator<WebElement>th=allcoldata.iterator();
    while(th.hasNext())
    {
		System.out.print(th.next().getText());
		System.out.println();
		System.out.println();
		
		}*/
		
	}

}
