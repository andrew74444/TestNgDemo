package Testpackage3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class XMLParameterization {

	
	protected WebDriver driver = null;
	
	
	
	@Test
	public void x(String browser,String value) {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(driver);
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		driver.findElement(By.name("q")).sendKeys(value);
		
		SoftAssert st = new SoftAssert();
		
		
		st.assertEquals(driver.getTitle(), "Google");
		
		st.assertAll();
		
		driver.quit();
	}
}