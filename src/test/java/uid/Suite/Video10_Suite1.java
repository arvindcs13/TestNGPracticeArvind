package uid.Suite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Video10_Suite1 {

	@BeforeSuite
	public void foo() {
		System.out.println("Before Suite Run .........................");
	}
	
	@AfterSuite
	public void foo2() {
		System.out.println("After Suite Run .........................");
	}
	
	@BeforeClass
	public void foo3() {
		System.out.println("Before Class Run .........................");
	}

	@AfterClass
	public void foo4() {
		System.out.println("After Class Run .........................");
	}
	
	@BeforeTest
	public void foo5() {
		System.out.println("Before Test Run .........................");
	}
	
	@AfterTest
	public void foo6() {
		System.out.println("After Test Run .........................");
	}
	
	
	
	@BeforeMethod
	public void foo9() {
		System.out.println("Before Method Run .........................");
	}
	
	@AfterMethod
	public void foo10() {
		System.out.println("After Method Run .........................");
	}
	
	
}
