package aravind.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class Base1 extends Base0 {
	

	public String clickByAttributeXpath(String elexpath, String data) {

		try {
			CommonLog.log("invoked");
			String value = getAttributeByXpath(elexpath, "value");
			if (value.equalsIgnoreCase(data)) {
				if (clickByXpath(elexpath)) {
					ATUReports.add("Button clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				} else {
					ATUReports.add("Button clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
				}
			}
			CommonLog.log("click");
		} catch (Exception e) {

			CommonLog.log("fail click");
			ATUReports.add("Button clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		return elexpath  ;
	}



public String clickByAttributeXpathNew(String elexpath, String data) {

	try {
		CommonLog.log("invoked");
		
		
			if (enterTextByXpath(elexpath, data)) {
				ATUReports.add("Button clicked", data, LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			} else {
				ATUReports.add("Button clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			}
		
		CommonLog.log("click");
	} catch (Exception e) {

		CommonLog.log("fail click");
		ATUReports.add("Button clicked", data, LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	CommonLog.errorLog(e);
	}
	return elexpath  ;
}

}