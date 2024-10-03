package uid;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Vedio3_BeforeTestvsBeforeMethod {
	
	@BeforeTest
	public void beforTest() {
		System.out.println("Loginn......");
	}
	
	@AfterTest
	  public void afterTest() {
			System.out.println("LogingOut......");
		}
	
	@BeforeMethod
	public void beforMethod() {
		System.out.println("Data connection start ......");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Data connection close ......");
	}
	
	@Test(priority=1, description="THis test 1")
	  public void fooTesting() {
	    System.out.println("Test0");
	  }
	  
	
	  @Test(priority=2, description="THis test 2")
	  public void afooTesting1() {
		    System.out.println("Test1");
		  }
	  
	  

}
