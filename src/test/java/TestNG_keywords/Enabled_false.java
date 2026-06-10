package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled_false {//this enabled=false keyword in testNG is used to skip a testcase intentionally
@Test(priority = 2)
public void tc1() {
	Reporter.log("login", true);}

	@Test(priority = 1)
	public void tc2() {
		Reporter.log("logout", true);
	}
	@Test (enabled=false)//enabled=false is used to skip the tc intentionally.
	public void tc3() {
		Reporter.log("popup", true);
		
		
}
}
