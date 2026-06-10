package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitwait {
public static void main(String[] args) throws Throwable {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// src element
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		// destr ele
		//Thread.sleep(5000);// static wait of 5 seconds
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		// Actions class
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();



			
			
}
}
