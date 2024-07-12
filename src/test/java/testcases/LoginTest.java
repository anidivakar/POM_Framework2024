package testcases;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public class LoginTest {
	//WebDriver driver;
	//passing of driver object
	//other objects
	//base page class size
	//object validations 
	//multiple return types from a function/action
	//PageFactory design pattern -  passing the driver,create the object and initializing the elements/objects in the page
	
//	public void abc() {
//		EventFiringWebDriver driver = EventFiringWebDriver(new ChromeDriver());
//	}
	//EventFiringWebDriver driver;
	@Test
	public void loginTest() throws InterruptedException {
		ZohoTestSession session = new ZohoTestSession();
		
		session
		.init()
		.openBrowser("Mozilla")
		.goToHomePage()
		.validator(false).validateTitle(Constants.HOME_PAGE_TITLE)//returns homepage object,dont have to stop
		.validator(false).validateText("abc","abc")//returns homepage object, stops if validation fails
		.validator(true).validateElementPresence("id","ssss")
		.goToEnterUserNamePage();
		//.validator(false).validateTitle(Constants.HOME_PAGE_TITLE)//returns homepage object,dont have to stop
		//.submitUsername("anidivakark@gmail.com");		
		
//		TestNG testng = new TestNG();
//		testng.setTestSuites(Arrays.asList(new String [] {System.getProperty("user.dir"+"//")}));
//		testng.setSuiteThreadPoolSize(2);
//		testng.run();
		
		//ZohoWebConnector conn = new ZohoDriver();
		//conn.validateLogin();
		
	//System.setProperty("webdriver.gecko.driver", "D:/Selenium 4.10.0/Selenium 4.0.0/geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver", "D:\\Selenium 4.10.0\\Selenium 4.0.0\\chromedriver.exe");
	
//	driver = new EventFiringWebDriver(new FirefoxDriver());
	//WebDriverListener driver1 = new WebDriverListener(driver);
	//driver = new ChromeDriver();
//	driver.register(new ZohoEventListener());
	/*
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();

	driver.get("https://www.zoho.com");
	driver.findElement(By.linkText("Sign in")).click();	
	*/
	}
	

	@AfterTest
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		//driver.quit();
	}
}
