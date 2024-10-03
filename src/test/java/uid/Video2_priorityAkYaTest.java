package uid;

import org.testng.annotations.Test;

public class Video2_priorityAkYaTest {

  @Test(priority=1, description="THis test 1")
  public void fooTest() {
    System.out.println("Test not implemented");
  }
  
  @Test(priority=2, description="THis test 2")
  public void afooTest1() {
	    System.out.println("Test is good");
	  }
}
