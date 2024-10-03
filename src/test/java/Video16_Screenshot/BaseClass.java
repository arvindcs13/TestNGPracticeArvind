package Video16_Screenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 
	public static WebDriver driver;
	
	public static String browser="edge";
	
	@BeforeSuite
	public void launch() throws Throwable {
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
		
		System.out.println("Launching browser------------------------------");
		
	}
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
		System.out.println("Closing browser------------------------------");
	}
	
	
	@BeforeTest
	public void launchApplication() {
		System.out.println("Launching Application------------------------------");
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@BeforeClass
	public void logIn() {
		System.out.println("Logging into  Application------------------------------");
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}
	
	
	
}
