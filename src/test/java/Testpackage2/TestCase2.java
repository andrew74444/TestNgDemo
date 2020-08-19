package Testpackage2;

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

public class TestCase2 extends BaseTest {

	

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

	
}
