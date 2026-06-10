package TestNG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
@Test (invocationCount = 10)
public void tc() {
	Reporter.log("verify logo", true);
}
}
