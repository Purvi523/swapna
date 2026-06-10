package vtigerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d=new ChromeDriver();
	d.get("http://localhost:8877/");
	//UN
	d.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
//PWD
	d.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin@123");
//login script
	d.findElement(By.xpath("//input[@id='submitButton']")).click();
}
}
