package Actionsclasss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	//src element
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	//Thread.sleep(5000);
	//dest element
	WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	//actions class
	Actions a = new Actions(driver);
a.dragAndDrop(src, dest).perform();
driver.quit();


}
}
