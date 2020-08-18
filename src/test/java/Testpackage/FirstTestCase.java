package Testpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTestCase {

	String brower = "chrome";
	WebDriver driver = null;

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

	@Test(priority = 2, enabled = false)
	public void a() {

		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		// System.out.println(driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).getText());
		driver.findElement(By.name("q")).sendKeys("Selenium Training aaaaaaaaaaaaaa");
		// assertEquals(driver.getTitle(), "Yahoo");
		// System.out.println());
		SoftAssert st = new SoftAssert();
		st.assertEquals(driver.getTitle(), "Yahoo");
		st.assertEquals(driver.getTitle(), "Google");
		// st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();

		// driver.findElement(By.className("gNO89b")).click();
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().refresh();
		// driver.get("https://www.yahoo.com/");
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().back();
		// driver.navigate().forward();

	}

	@Test(priority = 1)
	public void c() {

		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		// System.out.println(driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).getText());
		driver.findElement(By.name("q")).sendKeys("Selenium Training cccccccccccccccc");
		// assertEquals(driver.getTitle(), "Yahoo");
		// System.out.println());
		SoftAssert st = new SoftAssert();
		// st.assertEquals(driver.getTitle(), "Yahoo");
		st.assertEquals(driver.getTitle(), "Google");
		// st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();

		// driver.findElement(By.className("gNO89b")).click();
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().refresh();
		// driver.get("https://www.yahoo.com/");
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().back();
		// driver.navigate().forward();

	}

	@Test(priority = 3)
	public void b() {

		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		// System.out.println(driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).getText());
		driver.findElement(By.name("q")).sendKeys("Selenium Training bbbbbbbbbbbbbb");
		// assertEquals(driver.getTitle(), "Yahoo");
		// System.out.println());
		SoftAssert st = new SoftAssert();
		// st.assertEquals(driver.getTitle(), "Yahoo");
		st.assertEquals(driver.getTitle(), "Google");
		// st.assertEquals(driver.getTitle(), "Yahoo");

		st.assertAll();

		// driver.findElement(By.className("gNO89b")).click();
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().refresh();
		// driver.get("https://www.yahoo.com/");
		// System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getTitle());
		// driver.navigate().back();
		// driver.navigate().forward();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);

		driver.quit();
	}

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

}
