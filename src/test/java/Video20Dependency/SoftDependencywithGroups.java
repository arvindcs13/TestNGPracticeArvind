package Video20Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependencywithGroups {

	
	@Test(groups="thar")
	public void student() {
		Assert.assertTrue(false);
	}
	
	
	@Test(groups="thar")
	public void student3() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void student1() {
		System.out.println("Student1");
	}
}
