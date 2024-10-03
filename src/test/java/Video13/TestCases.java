package Video13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	@Test(dataProvider="users",dataProviderClass=DataDemoClassinDifferentFile.class)
	public void loginSauce(String username, String lastname) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='login-button']"));
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test (dataProvider="student",dataProviderClass=DataDemoClassinDifferentFile.class)
	public void student(String name, String shcool) {
		System.out.println("Student Name :"+name+"School Name :"+shcool);
	}
	
}
