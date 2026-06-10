package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elementmethod {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Register.html");

//Firstname=> 1 way [Returntype is visible]
WebElement fntxt = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
fntxt.sendKeys("swapna");
		
//First name=> 2 way2[ Returntype is not visible]
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("dharamswapna");
		
			
	}

}
