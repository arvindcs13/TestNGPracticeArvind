package uid;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Video9_BeforeClassVsBeforeGroup {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class **********************************");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class ************************************");
		
	}
	
	@BeforeGroups(value="bvt")
	public void beforeGroup() {
		System.out.println("Before Group --------------------");
		
	}
	
	@AfterGroups(value="bvt")
	public void AfterGroup() {
		System.out.println("After Group --------------------");
		
	}
	

	@Test(groups="bvt")
	public void TC1() {
		System.out.println("Test Case 1");
	}
	
	@Test(groups="reg")
	public void TC2() {
		System.out.println("Test Case 2");
	}
	
	@Test (groups="bvt")
	public void TC3() {
		System.out.println("Test Case 3");
	}

}
