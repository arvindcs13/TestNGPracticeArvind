package uid;

import static org.testng.Assert.assertThrows;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Video8_SkiipingTestCases {

	
	//There are 3 ways to skip test cases
//	 1 way through enable tag
	@Test(enabled=false)
	public void testcase1() {
		System.out.println("testcase1");
	}
	
//	 2 way Forecfully Skiiping test
	
	@Test
	public void testcase2() {
		throw new SkipException("Forecfully Skiiping test Case2");
	}
	
	
// 3 rd way when condtion not matched 	
	boolean condition=false;
	
	@Test
	public void testcase3() {
		if(condition==true) {
			System.out.println("Execution Started");
		}
		else {
			throw new SkipException("Condition not matched");
		}
	}
}
