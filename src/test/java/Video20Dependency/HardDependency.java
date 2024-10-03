package Video20Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependency {

	@Test
	public void student() {
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="student")
	public void student1() {
		System.out.println("Student1");
	}
	
}
