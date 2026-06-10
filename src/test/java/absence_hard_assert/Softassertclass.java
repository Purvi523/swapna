package absence_hard_assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertclass {
@Test
public void TC1() {
 String S1="Hi";
 String s2="Hello";
 SoftAssert s= new SoftAssert();
 s.assertEquals(S1, s2);//step1= failed
 System.out.println("boss, am after failing step1");//step2
s.assertAll();

}}
 