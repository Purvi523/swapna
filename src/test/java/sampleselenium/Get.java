package sampleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");
Thread.sleep(8000);
driver.get("https://www.flipkart.com");
driver.close();
driver.get("https://www.myntra.com");
driver.get("https://www.google.com");
driver.quit();

}
}
