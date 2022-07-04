package session1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Session2CopyRevision {
		
		WebDriver driver;

		@BeforeClass
		public static void beforeClass() {
			System.out.println("before class");
		}

		@AfterClass
		public static void afterClass() {
			System.out.println("after class");
		}

		@Before
		public void launchBrowser() {
			System.out.println("before method");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver(); // object variable
			// delete cookies
			driver.manage().deleteAllCookies();
			// go to the site
			driver.get("https://techfios.com/billing/?ng=admin/");
			// maximize window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		@Test
		public void loginTest() throws InterruptedException {
			System.out.println("test method");
			// identify user name element & data insertion
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			// identify password element & data insertion
			driver.findElement(By.id("password")).sendKeys("abc123");
			// identify sign in element & click
			driver.findElement(By.name("login")).click();
			//assertion
			//Assert.;
			//another way to do assert
			//Assert.assert
			System.out.println("This is the account opening part");
			// clicking on Bank & Cash
			driver.findElement(By.partialLinkText("Bank & Cash")).click();
			driver.findElement(By.partialLinkText("New Account")).click();
			//Thread.sleep(5000);
			//file upload
			//identify the elemnt, use sendkeys as long as it is tag input
			//driver.findElement("")).sendkeys;
			//any other ytage you will have to use robot class
			
			// filing out the new account information
			System.out.println("This is ti fill out the account information");
			driver.findElement(By.id("account")).sendKeys("Saving Account");
			driver.findElement(By.id("description")).sendKeys("I am keeeping my saving here");
			driver.findElement(By.id("balance")).sendKeys("$129,000");
			driver.findElement(By.id("account_number")).sendKeys("214723387300");
			driver.findElement(By.id("contact_person")).sendKeys("Bintu C");
			driver.findElement(By.id("ib_url")).sendKeys("www.techfios.com/billing/?ng=admin/");
			Thread.sleep(3200);
			driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		    //driver.findElement(By.partialLinkText("alert alert-success fade in"));
			//WebElement expected= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[1]"));
			//String actualUrl="";
	        
			
			driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a/span[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")).click();
			driver.findElement(By.partialLinkText("Dashboard")).click();
		    //driver.findElement(By.xpath("//div[@id='page-wrapper']//input[@id='account']")).sendKeys("Sidy");	
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2")).click();
			driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();
			driver.findElement(By.linkText("Add Customer")).click();
			driver.findElement(By.xpath("//input[@id='account']")).sendKeys("Sidi");
			//driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/button")).click();
			
			//driver.finElement(By.name());
					
			
			//By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");
		
			
//			Assert.assertTrue("Wrong Page!!!", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());
			
//			Assert.assertEquals("Dashboard page not found!!", "Dashboard", driver.findElement(DASHBOARD_HEADER_FIELD).getText());
//			System.out.println(driver.findElement(DASHBOARD_HEADER_FIELD).getText());
			
			//Assert.assertEquals("Dashboard page not found!!", "Dashboard- iBilling", driver.getTitle());
//			System.out.println(driver.getTitle());
			
			//driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a/span[1]")).click();
			//driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")).click();
			
			By COUNTRY_DROPDOWN_FIELD = By.xpath("//*[@id=\"cid\"]");
			
			Select sel = new Select(driver.findElement(COUNTRY_DROPDOWN_FIELD));
			sel.selectByVisibleText("Amazon");
			
			//homework
			sel.getOptions();
			
			driver.findElement(By.name("email")).sendKeys("sc22@techfios.com");
			driver.findElement(By.id("phone")).sendKeys("2140002010");
			driver.findElement(By.name("address")).sendKeys(" 6451 public rd ");
			driver.findElement(By.name("city")).sendKeys("Dallas");
			driver.findElement(By.name("state")).sendKeys("Texas");
			driver.findElement(By.id("zip")).sendKeys("75253");
			      //Drop Down to handle list of countries
			
        By ALLCOUNTRY_DROPDOWN_FIELD = By.xpath("//select[@id='country']");
			
			Select sel2 = new Select(driver.findElement(ALLCOUNTRY_DROPDOWN_FIELD));
			sel2.selectByVisibleText("Guinea");
			//driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']")).sendKeys("QA training");
			driver.findElement(By.id("submit")).click();
			
			//Drop Down to handle list of currencies
			
	        By CURRENCYY_DROPDOWN_FIELD = By.xpath("//SELECT[@ID='currency']");
				
				Select sel3 = new Select(driver.findElement(CURRENCYY_DROPDOWN_FIELD));
				sel3.selectByVisibleText("USD");
				//Drop Down to handle list of countries
				
		        By GROUP_DROPDOWN_FIELD = By.xpath("//*[@id=\'group\']");
					
					Select sel4 = new Select(driver.findElement(GROUP_DROPDOWN_FIELD));
				
					sel4.selectByVisibleText("SQL");
					
					driver.findElement(By.xpath("//*[@id=\\'submit\\']\"")).click();
			
			
			
			
			
			
			
			
		    /*
			 This is static dropdown
			 WebElement ddown = driver.findElement(By.id("id"));
			Select select  = new Select(ddown);
			select.selectByIndex(3);
			select.selectByIndex(4);
			*/
		/*	//Dynamic drop down with select option from auto suggestive drop down
			String OptionToSelect ="Credit Account";
			int count=0;
			//driver.findElement(By.xpath("//input[@class='dz-hidden-input']")).sendKeys("credit");
			//driver.findElement(By.partialLinkText("Account")).sendKeys("credit a");
			//driver.findElement(By.className("dz-hidden-input"));
			//driver.findElement(By.id("select2-account-container")).sendKeys("credit a");
			driver.findElement(By.id("select2-account-container"));
			driver.findElement(By.xpath("span[class='select2-search select2-search--dropdown'] input[role='textbox']")).sendKeys("credit a");
			//Thread.sleep(300);
			List<WebElement> optionList =  driver.findElements(By.xpath("//ul[@id = 'select2-account-results']//li"));
			for(WebElement ele:optionList) {
				String currentOption=ele.getText();
				if(currentOption.contains(OptionToSelect)) {
					ele.click();
					count++;
					break;
				}
			}
			if (count!=0) {
				System.out.println(OptionToSelect + " has been selected in the DD");
				
			}
			else {
				System.out.println("The option you wanna select is not available in the database buddy");
			}
		*/	
		}

		/*
		 * public void bankAccount() throws InterruptedException {
		 * System.out.println("This is the account opening part"); // clicking on Bank
		 * & Cash driver.findElement(By.partialLinkText("Bank & Cash")).click();
		 * driver.findElement(By.partialLinkText("New Account")).click();
		 * Thread.sleep(5000);
		 * 
		 * 
		 * }
		 */

		/*
		 * public void newAccount() { // filing out the new account information
		 * System.out.println("This is ti fill out the account information");
		 * driver.findElement(By.id("Account")).sendKeys("Saving Account");
		 * 
		 * driver.findElement(By.id("Description")).
		 * sendKeys("I am keeeping my saving here");
		 * 
		 * driver.findElement(By.id("balance")).sendKeys("$125,000");
		 * driver.findElement(By.id("account_number")).sendKeys("214723387400");
		 * driver.findElement(By.id("contact_person")).sendKeys("Bintu C");
		 * driver.findElement(By.name("submit")).click();
		 * driver.findElement(By.id("ib_url")).sendKeys(
		 * "www.techfios.com/billing/?ng=admin/"); try { Thread.sleep(6500); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * }
		 */

			
			
			
		

		//@Test
		public void negLoginTestPassword() {
			System.out.println("neg test method");
			// identify user name element & data insertion
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			// identify password element & data insertion
			driver.findElement(By.id("password")).sendKeys("abc12323423");
			// identify sign in element & click
			driver.findElement(By.name("login")).click();
		}

	//@Test
		public void negLoginTestUser() {
			System.out.println("neg test method");
			// identify user name element & data insertion
			driver.findElement(By.id("username")).sendKeys("demo@techfios1.com");
			// identify password element & data insertion
			driver.findElement(By.id("password")).sendKeys("abc123");
			// identify sign in element & click
			driver.findElement(By.name("login1")).click();
		}

		@After
		public void tearDown() {
			System.out.println("after method");
			// close browser
			//driver.close();
			//driver.quit();
		}

	}
	
