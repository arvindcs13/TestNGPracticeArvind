package uid.Suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Video10_Suite2 extends Video10_Suite1 {
	
	

	@Test(groups="car")
	public void test1() {
		System.out.println("Test Case 1");
	}
	
	
	@Test(groups="car")
	public void test2() {
		System.out.println("Test Case 2");
	}
	

	@Test(groups="bike")
	public void test3() {
		System.out.println("Test Case 3");
	}
	
	
	@Test(groups="bike")
	public void test4() {
		System.out.println("Test Case 4");
	}
	
	@BeforeGroups(value="car")
	public void foo7() {
		System.out.println("Before Group Run .........................");
	}
	
	@AfterGroups(value="car")
	public void foo8() {
		System.out.println("After Group Run .........................");
	}
}
