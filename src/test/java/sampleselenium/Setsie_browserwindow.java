package sampleselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsie_browserwindow {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.Amazon.com");
	Dimension b=new Dimension(1500, 1800);
	driver.manage().window().setSize(b);
	Thread.sleep(10000);
	driver.close();
}
}
