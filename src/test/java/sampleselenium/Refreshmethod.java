package sampleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshmethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	Thread.sleep(5000);
	driver.navigate().to("https://www.myntra.com");
	Thread.sleep(5000);
	driver.navigate().back();//WD will open flipkart web page.
	Thread.sleep(5000);
	driver.navigate().forward();//wd will open myntra web page.
	
}
}
