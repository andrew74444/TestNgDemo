package Testpackage3;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterizationByMultipleDataProviders {

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password) throws InterruptedException {
		System.out.println(username + "---" + password);
		Date d = new Date();
		System.out.println("Browser name : "+d);
		Thread.sleep(2000);

	}
	
	
	@Test(dataProvider = "getData1")
	public void InvalidLogin(String username, String password) throws InterruptedException {
		System.out.println(username + "---" + password);
		Date d = new Date();
		System.out.println("Browser name : "+d);
		Thread.sleep(2000);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "trainer@way2automation.com";
		data[0][1] = "sdfsdf";
		data[1][0] = "java@way2automation.com";
		data[1][1] = "sdfsdfsf";
		return data;

	}

	
	@DataProvider
	public Object[][] getData1() {
		Object[][] data = new Object[2][2];
		data[0][0] = "sasiakula33@gmail.com";
		data[0][1] = "test@123";
		data[1][0] = "sasiakula99@gmail.com";
		data[1][1] = "admin@123";
		return data;

	}
	
	@DataProvider
	public Object[][] getData2() {
		Object[][] data = new Object[2][2];
		data[0][0] = "sasiakula33@gmail.com";
		data[0][1] = "test@123";
		data[1][0] = "sasiakula99@gmail.com";
		data[1][1] = "admin@123";
		return data;

	}
	
	@DataProvider
	public Object[][] getData3() {
		Object[][] data = new Object[2][2];
		data[0][0] = "sasiakula33@gmail.com";
		data[0][1] = "test@123";
		data[1][0] = "sasiakula99@gmail.com";
		data[1][1] = "admin@123";
		return data;

	}
	
}
