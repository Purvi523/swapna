package Sample;

import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Find_elements_method {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");	
		 
	List<WebElement> elements = driver.findElements(By.xpath("//input"));//for multiple tagnames with"input"
		  
	for( WebElement ele:elements) {
		 System.out.println(ele.getTagName());
	 }
	
}
}
