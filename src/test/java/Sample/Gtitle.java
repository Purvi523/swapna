package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gtitle {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	
	WebDriver d= new ChromeDriver();
	d.get("https://www.myntra.com");
	String t = d.getTitle();
	System.out.println(t);
		
}
}
