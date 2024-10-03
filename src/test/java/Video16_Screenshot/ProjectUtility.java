package Video16_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ProjectUtility extends BaseClass{

	public void getScreenshot() throws IOException {
		
		Date today = new Date();
		String screenshotName= today.toString().replace(" ", "_").replace(":", "_");
		File screenshotfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("C:\\Users\\Vijay\\naya-workspace\\vTestNGLoa\\Screenshottest"+screenshotName+".png"));
	}
	
}
