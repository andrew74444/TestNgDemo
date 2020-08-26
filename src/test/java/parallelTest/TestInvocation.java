package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	
	//Automation Architect Selenium with 7 Live Project
	@Test(invocationCount=5,threadPoolSize=2)
	public void executeTest() {
		
		driver = getDriver("chrome");
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
