package TestNG;

public class Parallel_cross_browser {

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.Test;

{

	    @Test(threadPoolSize = 3, invocationCount = 1)
	    public void chromeTest() {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Chrome Executed");
	        driver.quit();
	    }

	    @Test(threadPoolSize = 3, invocationCount = 1)
	    public void firefoxTest() {

	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Firefox Executed");
	        driver.quit();
	    }

	    @Test(threadPoolSize = 3, invocationCount = 1)
	    public void edgeTest() {

	        WebDriver driver = new EdgeDriver();
	        driver.get("https://www.google.com");
	        System.out.println("Edge Executed");
	        driver.quit();
	    }
	}

