package uid;

import org.testng.annotations.Test;


@Test(groups="from")
public class Video6_groups {
	
	
	  @Test( groups="bvt",description="THis test 0")
	  public void fooTest() {
	    System.out.println("Test not implemented0");
	  }
	  
	  @Test( groups="regression", description="THis test 1")
	  public void fooTest1() {
	    System.out.println("Test not implemented1");
	  }
	  
	  @Test(groups={"regression","bvt"} ,description="THis test 2")
	  public void fooTest2() {
	    System.out.println("Test not implemented2");
	  }
	  
	  @Test( groups={"regression","feature"} , description="THis test 3")
	  public void fooTest3() {
	    System.out.println("Test not implemented3");
	  }
	  
	  @Test( groups="feature" , description="THis test 4")
	  public void fooTest4() {
	    System.out.println("Test not implemented4");
	  }
	
	
	  
}
