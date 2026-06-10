package vtigerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver d= new ChromeDriver();
	d.get("https://demo.automationtesting.in/Register.html");
	//FN
	d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Daram");
	//LN
	d.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Swapna");
	//Address
	d.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("KPHB");
	//Email
	d.findElement(By.xpath("//input[@type='email']")).sendKeys("swapna@gmail.com");
	//phN
	d.findElement(By.xpath("//input[@type='tel']")).sendKeys("1345678");


}  
}
