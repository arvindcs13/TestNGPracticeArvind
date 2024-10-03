package Video14_Pass_ParameterTestNGxml;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Video16_Screenshot.ProjectUtility;

public class Listeners_Video15 extends ProjectUtility implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Testing is started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testing is Passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Taking  Screenshot.........");
		try {
			getScreenshot();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(" i dd Timeout.......");
		
	}

	

}
