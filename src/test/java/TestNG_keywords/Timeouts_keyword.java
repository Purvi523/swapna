package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts_keyword {

	@Test (priority = 2, timeOut = 1)
	public void tc1()
	{
		Reporter.log("logout", true);
	}
	@Test(priority = 1)
	public void tc2() {
		Reporter.log("login",true);
	}}
