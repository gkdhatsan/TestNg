package aravind.project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners({ATUReportsListerner.class,ConfigurationListener.class,MethodListener.class})
public class Execution extends Base2{

	@Test(dataProvider = "data")
	public void method1(String email) {
		
		browserLaunch("chrome", "https://www.facebook.com/");
		
		sendUsername(email);
		
		
	}
	@DataProvider(name="data")
	public Object[][] input() {

		return DataInput.getSheet("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\src\\test\\java\\aravind\\project\\facebook.aravind.xls", "facebook");
		
	}
}
