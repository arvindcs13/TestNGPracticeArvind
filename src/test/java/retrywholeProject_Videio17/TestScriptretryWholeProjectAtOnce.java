package retrywholeProject_Videio17;

import org.testng.Assert;
import org.testng.annotations.Test;

import Video16_Screenshot.BaseClass;

public class TestScriptretryWholeProjectAtOnce extends BaseClass{
	
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
	
	@Test
	public void doB() {
		String actual="";
		String expected="";
		Assert.assertEquals(actual, expected);
	}

}
