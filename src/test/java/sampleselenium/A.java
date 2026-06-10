package sampleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("swapna");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Dharam");
}
}
