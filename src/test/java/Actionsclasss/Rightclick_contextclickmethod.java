package Actionsclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_contextclickmethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.google.com");
		//move the selenium control to gmail element
WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
   //move to that element using action class
Actions a= new Actions(driver);
a.moveToElement(gmail).perform();//first one is move to element
//right click operation
a.moveToElement(gmail).contextClick().doubleClick(gmail).build().perform();  


 

}
}
