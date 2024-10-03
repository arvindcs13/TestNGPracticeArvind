package Video20Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependency {

	
	@Test
	public void student() {
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void student3() {
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods={"student","student3"}, alwaysRun=true)
	public void student1() {
		System.out.println("Student1");
	}
}
