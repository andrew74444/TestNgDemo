import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	
	
	@Test
	public void test() {
		
		
		String brower = "chrome";
		WebDriver driver = null;

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
		//
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
//		System.out.println(driver.findElement(By.xpath("(//*[@class='gNO89b'])[2]")).getText());
		driver.findElement(By.name("q")).sendKeys("Selenium Training");
		
		
		
//		driver.findElement(By.className("gNO89b")).click();
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().refresh();
//		driver.get("https://www.yahoo.com/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		driver.navigate().forward();
		driver.quit();
	}

		
	}
	
	
	

