package uid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Video4_AssertionsTestng {
	
	
	
	@Test(priority=1, description="THis test 1")
	  public void test_2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actual= driver.getTitle();
		String expected= "Electronics, Cars, Fashion, Collectibles & More | eBay1234";
		Assert.assertEquals(actual, expected);
		System.out.println("Title pass");
	  }
	  
	
	 
}
