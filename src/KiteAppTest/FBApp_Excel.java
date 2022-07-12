package KiteAppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBApp_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("D:\\Selenium\\FBinfo.xlsx");	
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		//String UN = mySheet.getRow(5).getCell(0).getStringCellValue();

		 String Fname    =    mySheet.getRow(1).getCell(0).getStringCellValue();
	     String Lname    =    mySheet.getRow(1).getCell(1).getStringCellValue();
		 String Mobileno =    mySheet.getRow(1).getCell(2).getStringCellValue();
		 String newpass  =    mySheet.getRow(1).getCell(3).getStringCellValue();
		
		System.out.println(Fname);
	    System.out.println(Lname);
		System.out.println(Mobileno);
		System.out.println(newpass);

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium1\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Ce%7Cfacebook%20login%7C&placement=&creative=589460569900&keyword=facebook%20login&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409285535%26loc_physical_ms%3D9302986%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuuCyy8UV3jX4aDDF7TAtjAiwUg_EwIVzQwJlRJDkn2ozF4pYHfj3MkaAgnVEALw_wcB");
		
	   WebElement value1 = driver.findElement(By.xpath("//input[@name='firstname']"));
	   WebElement value2=driver.findElement(By.xpath("//input[@aria-label='Surname']"));
	   WebElement value3=driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
	   WebElement value4=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	   	   
	   value1.sendKeys(Fname);
	   value2.sendKeys(Lname);
	   value3.sendKeys(Mobileno);
	   value4.sendKeys(newpass); 
	
	}

}
