package aravind.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base0 {

	WebDriver driver;
	
	public Properties pro(String FileName) throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream(new File(FileName)));
		return p;
	}
	public WebDriver browserLaunchOld(String browserName, String url) {
//set hub url
		
		//URL url1 = new URL("webaddress");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browserName);
		dc.setPlatform(Platform.WINDOWS);
		//driver = new ChromeDriver(url1,dc);
		driver.get(url);
		return driver;
	}
	
	public void browserLaunch(String browserName, String url) {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browserName);
		dc.setPlatform(Platform.WINDOWS);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	
	}
	public String getAttributeByXpath(String elexpath, String attribute) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elexpath)));
		String text = driver.findElement(By.xpath(elexpath)).getAttribute(attribute);
		return text;
	}

	public boolean clickByXpath(String clickxpath) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(clickxpath)));
		driver.findElement(By.xpath(clickxpath)).click();
		return true;
	}

	public boolean enterTextByXpath(String sendxpath, String text) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sendxpath)));
		driver.findElement(By.xpath(sendxpath)).click();
		driver.findElement(By.xpath(sendxpath)).clear();
		driver.findElement(By.xpath(sendxpath)).sendKeys(text);
		return true;
	}

	public boolean enterTextWithJs(String jssendxpath) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(jssendxpath)));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','text')", until);
		return true;
	}
}
