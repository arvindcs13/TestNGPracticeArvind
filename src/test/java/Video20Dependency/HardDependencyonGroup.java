package Video20Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardDependencyonGroup {

	@Test(groups="bvt1")
	public void student() {
		Assert.assertTrue(false);
	}
	
	@Test(groups="bvt1")
	public void student1() {
		System.out.println("Student1");
	}
	
	@Test(dependsOnGroups="bvt1")
	public void student2() {
		System.out.println("Student2");
	}
}
