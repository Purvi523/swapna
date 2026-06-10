package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test (priority = 2)
public void tc1()
{
	Reporter.log("logout", true);
}
@Test(priority = 1)
public void tc2() {
	Reporter.log("login",true);
}

}
