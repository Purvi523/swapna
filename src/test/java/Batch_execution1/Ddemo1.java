package Batch_execution1;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ddemo1 {
@Test
public void TC01() {
Reporter.log("Running TC01",true );
Assert.fail();
}
@Test
public void TC02() { 
Reporter.log("Running TC02", true);}
@Test
public void TC03() { 
Reporter.log("Running TC03", true);
}}