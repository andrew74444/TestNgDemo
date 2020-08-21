package Testpackage3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	String brower = "chrome";
	protected WebDriver driver = null;
	
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforeSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeClass");
	}

	
	@BeforeMethod
	public void openBrowser() {

		if (brower.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (brower.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		System.out.println("beforeMethod");
	}
	
	
	
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("AfterSuite");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@AfterClass
	public void Afterclass() {
		System.out.println("AfterClass");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}
	
	

}
