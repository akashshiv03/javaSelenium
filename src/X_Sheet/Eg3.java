package X_Sheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
     File myfile = new File("D:\\\\Selenium\\\\info.xlsx");
	 System.out.println(myfile);
     
	 Sheet sheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	 int totalNumberOfRows = sheet.getLastRowNum();
	 int rowCount = totalNumberOfRows;

	 System.out.println(rowCount);
	 
	 sheet.getLastRowNum(totalerow)
	}

}
