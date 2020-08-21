package util;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviders {
	
	
	
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")){
		
		data = new Object[2][2];
		
		data[0][0] = "andrew";
		data[0][1] = "Selenium";
		
		data[1][0] = "Thomson";
		data[1][1] = "Training";
		
		}else if(m.getName().equals("testUserReg")){
			
			data = new Object[2][3];
			
			data[0][0] = "Steve";
			data[0][1] = "smith";
			data[0][2] = "stevesmith2580@gmail.com";
			
			data[1][0] = "andrew";
			data[1][1] = "Thomson";
			data[1][2] = "andrew74444@gmail.com";
			
		}
		return data;
		
		
	}
	
	
	
	@DataProvider(name="dp2")
	public static Object[][] getData2(){
		
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "India";
		data[0][1] = "Hyderabad";
		data[0][2] = "Selenium Training";
		
		data[1][0] = "US";
		data[1][1] = "New York";
		data[1][2] = "USNewYork@gmail.com";
		return data;
		
		
	}

}
