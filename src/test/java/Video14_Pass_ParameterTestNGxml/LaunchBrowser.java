package Video14_Pass_ParameterTestNGxml;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Video13.DataDemoClassinDifferentFile;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void launch(String browser) throws Throwable {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
        else if(browser.equals("firefox")) {
        	WebDriverManager.firefoxdriver().setup();
        	driver = new FirefoxDriver();
			
		}
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']"));
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void testcase2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void testcase3() {
		System.out.println("Boogie.....");
	}
	
	
}
