package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh {
public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver d = new ChromeDriver();
d.navigate().to("https://www.flipkart.com");
Thread.sleep(5000);
d.navigate().to("https://www.nyka.com");
Thread.sleep(5000);
d.navigate().back();
Thread.sleep(5000);
d.navigate().forward();

}
}
