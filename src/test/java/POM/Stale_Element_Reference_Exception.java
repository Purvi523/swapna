package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_Element_Reference_Exception {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.navigate().refresh();//
	//FN
	 WebElement FN=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//refresh the m page using refresh method.
	 //this line of code implies that  we are refreshing the page and once the page is refreshed, the session id will chage or get updated. for exmaple if present session ID or SID is 1010, now after this line SID will change to 2020
FN.sendKeys("swapna");	 

}
}
