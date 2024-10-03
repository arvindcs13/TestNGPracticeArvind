package ParallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoParrallel {

	@Test
	public void Test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");	
		driver.navigate().to("https://www.facebook.com/");		
		driver.navigate().back();		
		driver.navigate().forward();		
		driver.navigate().refresh();
		driver.close();
	}
	
	@Test
	public void Test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
         
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement drop= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action= new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		driver.quit();
	}
	
	@Test
	public void Test3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        
        Actions action= new Actions(driver);
//        action.contextClick().perform(); //right click anywhere on webpage
		WebElement element= driver.findElement(By.xpath("//input[@id='userName']"));
		action.contextClick(element).perform();
		driver.quit();
	}
	
	@Test
	public void Test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']"));
		driver.quit();
	}
	
	@Test
	public void Test5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		WebElement parentFrame= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parentFrame);
		driver.switchTo().frame(0);
		 WebElement textframe=driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(textframe.getText());
			driver.switchTo().parentFrame(); // switch the control to parent frame
		System.out.println(driver.findElement(By.xpath("//body[text()='Parent frame']")).getText());
		driver.switchTo().defaultContent(); // switch the control to main window
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
