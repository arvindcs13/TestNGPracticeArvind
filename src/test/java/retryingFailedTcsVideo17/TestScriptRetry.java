package retryingFailedTcsVideo17;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScriptRetry {
	@Test(retryAnalyzer=retryingFailedTcsVideo17.SingleTestCasesRetry.class)
	public void FirstName() {
		String actual="Arvind";
		String expected="Arvind";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(retryAnalyzer=retryingFailedTcsVideo17.SingleTestCasesRetry.class)
	public void LastName() {
		String actual="Yadav";
		String expected="Yadav1";
		Assert.assertEquals(actual, expected);
	}
}
