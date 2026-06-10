package sampleselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	String txt = driver.findElement(By.xpath("//h1[.='Automation Demo Site ']")).getText();
System.out.println(txt);

}
}
