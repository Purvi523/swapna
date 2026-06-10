package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF1 {
	
	public static void main(String[] args) throws Throwable {
		
	//EXcel reader 
	FileInputStream fis = new FileInputStream("C:\\Users\\pdara\\Desktop\\Copy of swapna test case practice.xlsx");
	//String FN = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 //	WebDriver driver=new ChromeDriver();
//System.out.println(FN);
//FN
//driver.get("https://demo.automationtesting.in/Register.html");
//driver.findElement(By.xpath("//input[@type='text']")).sendKeys(FN);

//Booleann data
//Boolean FN1 = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getBooleanCellValue();
//System.out.println(FN1);

//Interger data
 double FN2 = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
System.out.println(FN2);	}
}