package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentUrl {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://www.google.com");
	d.manage().window().maximize();
	Thread.sleep(5000);
	//d.manage().window().minimize();
	String url = d.getCurrentUrl();
	System.out.println(url);



}
}
