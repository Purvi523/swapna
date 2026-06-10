package absence_hard_assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Presence_of_assert_class {
@Test
public void test() {
	String expT="Hi";
	String actT="Hi";
	Assert.assertEquals(expT , actT,"TC is passed");
	
	
}

}
