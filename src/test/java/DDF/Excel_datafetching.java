package DDF;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_datafetching {
public static void main(String[] args) throws Throwable, IOException {
	WebDriver driver= new ChromeDriver();
	//driver.get("");
	FileInputStream fis = new FileInputStream("C:\\Users\\pdara\\Desktop\\Copy of swapna test case practice.xlsx");
	String data = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
