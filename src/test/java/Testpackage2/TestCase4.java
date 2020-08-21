package Testpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase4 {

	String brower = "chrome";
	protected WebDriver driver = null;

	@Test()
	public void x() {
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
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		driver.findElement(By.name("q")).sendKeys("Selenium Training");
		
		SoftAssert st = new SoftAssert();
		
		st.assertEquals(driver.getTitle(), "Yahoo");
		st.assertEquals(driver.getTitle(), "Google");
		st.assertEquals(driver.getTitle(), "xyz");
		st.assertAll();
	}
}