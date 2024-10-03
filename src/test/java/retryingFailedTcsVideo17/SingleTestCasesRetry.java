package retryingFailedTcsVideo17;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class SingleTestCasesRetry implements IRetryAnalyzer{
	public int retrycount=0;
	public final int maxretrycount=4;
	public boolean retry(ITestResult result) {
		if(retrycount<maxretrycount) {
			retrycount++;
			return true;
		}
		
		return false;
	}

}
