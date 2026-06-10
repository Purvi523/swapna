package DDF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Daram");
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Swapna");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("dswapna2007@gmail.com");
}}