package sample_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice_TNG {

    @Test
    public void test() {
       Reporter.log("Hi", true);
    	Reporter.log("Hello");
    }

}
