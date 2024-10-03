package uid;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Video5_SoftAssertion {
	
	@Test(priority=1, description="THis test 1")
	  public void test_2() {
		SoftAssert sf = new SoftAssert();
		
		
		
		System.out.println("Launching Browser...");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actual= driver.getTitle();
		String expected= "Electronics, Cars, Fashion, Collectibles & More | eBay1";
		System.out.println("Verfiying Title");
		sf.assertEquals(actual, expected, "Title Validation failed");
		
		
		String Txt_actual=driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		String text_expected= "Search";
		System.out.println("Verfiying Text");
		sf.assertEquals(Txt_actual, text_expected, "TeXt Verifcation Failed");
		System.out.println("Closing Browser...");
		driver.close();
		sf.assertAll(); //to report the failure you need to append soft assert 
		
	  }
}
