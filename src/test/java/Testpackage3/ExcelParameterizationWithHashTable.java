package Testpackage3;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import util.ExcelReader;

public class ExcelParameterizationWithHashTable {

	protected WebDriver driver = null;

	
	@Test(dataProvider="getData")
	public void x(Hashtable<String,String> data) throws InterruptedException {
		
		if(data.get("is_correct").equalsIgnoreCase("y")) {
		if (data.get("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (data.get("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\workspace\\SeleniumJavaProject\\Executable files\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println(driver);
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Brower Open Successfully");
		driver.findElement(By.name("q")).sendKeys(data.get("value"));

		SoftAssert st = new SoftAssert();

		st.assertEquals(driver.getTitle(), "Google");

		st.assertAll();
		Thread.sleep(2000);

		driver.quit();}
		else {
			throw new SkipException("Skipping the test as the Is correct is marked as N");
		}
	}

	public static ExcelReader excel = null;
	
	@DataProvider
	public static Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader(
					System.getProperty("user.dir") + "//src//test//resources//testdata//testngdata.xlsx");

		}

		String sheetName = "loginTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][1];

		Hashtable<String,String> table = null;
		
		
		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			table = new Hashtable<String,String>();
			
			for (int colNum = 0; colNum < cols; colNum++) {

				
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
//				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				data[rowNum-2][0]=table;
			}
		}
		return data;
	}
}