package Sample;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Posit {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com");
	Point p=  new Point(100, 200);
	d.manage().window().setPosition(p);
	
	
	
}
}
