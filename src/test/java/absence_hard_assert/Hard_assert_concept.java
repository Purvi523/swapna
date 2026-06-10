package absence_hard_assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_assert_concept {
@Test
public void TC1() {
Reporter.log("running TC1", true);//step1
Assert.fail();//intentionally failing Tc
System.out.println("am after failing first step");//step2
}

@Test
public void TC2() {
Reporter.log("running TC2", true);

}}
