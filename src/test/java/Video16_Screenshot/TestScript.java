package Video16_Screenshot;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{

	
	@Test
	public void FirstName() {
		String actual="Arvind";
		String expected="Arvind";
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void LastName() {
		String actual="Yadav";
		String expected="Yadav1";
		Assert.assertEquals(actual, expected);
	}
	
}
