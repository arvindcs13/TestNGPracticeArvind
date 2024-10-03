package Video13;

import org.testng.annotations.DataProvider;

public class DataDemoClassinDifferentFile {

	@DataProvider (name="users")
	public Object[][] dataSet() throws Throwable {
		
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
}
	
	
	
	@DataProvider (name="student")
	public Object[][] dataSet2() throws Throwable {
		
		return new Object[][] {
			{"Arvind ","CA"},
			{"Mohit ","BA"},
			{"Abhinav","HCL"},
			{"Sankalp","Samsung"}
		};
}

}
