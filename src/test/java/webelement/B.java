package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	 WebElement fn = driver.findElement(By.xpath("//input[@type='text'][1]"));
	fn.sendKeys("swapna");
	Thread.sleep(3000);
	fn.clear();
	Thread.sleep(3000);
	//submit button
	WebElement sbtn = driver.findElement(By.xpath("//button[@id='submitbtn']"));
	sbtn.click();
	Thread.sleep(15000);
	driver.quit();
	
}
}
