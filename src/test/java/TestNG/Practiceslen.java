package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practiceslen {
@Test 
	public void sample()
{
Reporter.log("Rules for TestNg");
Reporter.log("@Test right after class",true);
Reporter.log("Rules for TestNg",true);
}
}
