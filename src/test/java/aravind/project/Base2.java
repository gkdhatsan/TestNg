package aravind.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base2 extends Base1 {

	static WebDriver driver;
	Properties p;

	public void properLocation() {
		
		try {
			 p = pro("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\src\\test\\java\\aravind\\project\\Property.properties");
			//("./aravind\\project\\Property.properties")
		} catch (Exception e) {
			
		}

	}

	public void click(String data) {

		try {
			clickByAttributeXpath(p.getProperty("elexpath"),data);
		} catch (Exception e) {

			CommonLog.errorLog(e);
		}
		
		
	}
	public Base2 sendUsername( String data) {
		
		try {
			clickByAttributeXpathNew(p.getProperty("elexpath"), data);
			
		} catch (Exception e) {
			
			CommonLog.errorLog(e);
		}
return this;
	}
	

}
