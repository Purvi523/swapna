package Sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dim {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com");
	Dimension f=new Dimension(600, 400);
d.manage().window().setSize(f);
	
}
}
