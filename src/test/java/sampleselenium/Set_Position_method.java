package sampleselenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Position_method {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com");
	Point p=new Point(200, 300);
	driver.manage().window().setPosition(p);
	Thread.sleep(10000);
	driver.close();
}
}
