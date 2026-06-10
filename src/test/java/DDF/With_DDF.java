package DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class With_DDF {
	 public static void main(String[] args) throws Throwable {

		 FileInputStream fis = new FileInputStream("C:\\Users\\pdara\\Desktop\\Copy of swapna test case practice.xlsx");

	   	     // WB class will open the excel sheet with the help of create method
	    	Workbook wb = WorkbookFactory.create(fis);
	    	
	    	// navigate to 0th row and 0th cell
	    	String FN= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	    	System.out.println(FN);
	    	
	    	// Naviagte to 0th row and 1st cell
	    	String LN= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    	System.out.println(LN);
	   
	    	// 	Address
	    	String address =wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
	    	System.out.println(address);
	    	
	    	//Phone Number
	    	 long ph = (long) wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	    	System.out.println(ph);
	    	
	    	//email id
	    	 String email=wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
	    	System.out.println(email);
	    	
	    	//pwd
	    	 String pwd=wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
	    	System.out.println(pwd);
	    	
	    	//confirm pwd
	    	 String Cpwd=wb.getSheet("Sheet1").getRow(5).getCell(1).getStringCellValue();
	    	System.out.println(Cpwd);
	    	
	  	    	// Load application in which we need test data from excel file
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("https://demo.automationtesting.in/Register.html");
	    	
	    	// fill inf in the application by r=writing locators
	    	//FN
	    	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(FN);
	    	//LN
	    	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(LN);
	 //Address
	    	driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(address);
//phonenumbe
	    	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(String.valueOf(ph));
	    	//email
	    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	    	
//pwd
	    	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(pwd);
//confirm pwd
	    	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(Cpwd);
	 
	 
	 
	 
	 
	 
	 
	 
	 }}	    	