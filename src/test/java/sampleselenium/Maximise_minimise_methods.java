package sampleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximise_minimise_methods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.manage().window().minimize();//as minimise method is not stable yet, so the browser will close
	 String url=driver.getCurrentUrl();
	 System.out.println(url);
}
}
