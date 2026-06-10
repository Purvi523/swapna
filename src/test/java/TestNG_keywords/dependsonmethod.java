package TestNG_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {//if login fails, then logout also fails, because logout depend on login
	@Test 
	public void tc1() {
		Reporter.log("login", true);
	}
@Test(priority=1, dependsOnMethods = {"tc1"})
public void tc2() {
	Reporter.log("logout", true);
Assert.fail();
}
}
 