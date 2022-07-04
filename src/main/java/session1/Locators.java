package session1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {
	
WebDriver driver;
	
	@Before
	public void init() {
		
//		user.dir
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\December2021_Selenium\\session2\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.selenium.dev/");
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void DifferentLocators() {
		
		//https://www.selenium.dev/
//		driver.findElement(By.linkText("About Selenium")).click();
//		driver.findElement(By.partialLinkText("Crisis Fund")).click();
		
		//https://techfios.com/billing/?ng=admin/
		driver.findElement(By.cssSelector("input#username")).sendKeys("demo@techfios.com");
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc123");
//		driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Password'][name='password']")).sendKeys("abc123");
		
		//Absolute xpath
//		driver.findElement(By.xpath("html/body/div/div/div/form/div[3]/button")).click();
		
		//Relative xpath
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Customers']")).click();
//		driver.findElement(By.xpath("//span[text()=\"Customers\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(), 'Add Customer1')]"))));
		
		driver.findElement(By.xpath("//a[contains(text(), 'Add Customer')]")).click();
		
		
	}

}
