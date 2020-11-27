package launchBrowser;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class LoginTestJunit {
	 
  WebDriver driver;
	

	@Before
	public  void LaunchBrowser() {
		
		       //set the property for chrome driver//
				System.setProperty("webdriver.chrome.driver","C:\\Users\\aarav\\eclipse-workspace\\june20Selinium\\FirstSeleniumProject\\driver\\chromedriver.exe" );
				// create object of web driver //
				driver = new ChromeDriver();
				// going to the website
				driver.get("http://www.techfios.com/billing/?ng=admin/");
				//maximize browser//
				driver.manage().window().maximize();
	}
	
 @Test
 public void LoginTest() {
	    //pass username on username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//pass password on password field
		driver.findElement(By.id("password")).sendKeys("abc123");
		//click on login
		driver.findElement(By.name("login")).click();
 }
 
 
 
 
 @Test
 public void LoginTest1() {
	    //pass username on username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//pass password on password field
		driver.findElement(By.id("password")).sendKeys("abc123");
		//click on login
		driver.findElement(By.name("login")).click();
 }
 
 @Test
 public void LoginTest2() {
	    //pass username on username field
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//pass password on password field
		driver.findElement(By.id("password")).sendKeys("abc123");
		//click on login
		driver.findElement(By.name("login")).click();
 }
 
	      @After
		  public void tearDown() {
		//close browser
		driver.close();
		  }
} 

	
 
 
 
 
 
 
 
 
