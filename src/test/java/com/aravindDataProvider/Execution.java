package com.aravindDataProvider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Execution extends FuntionalLib {
	WebDriver driver;
	@Test(dataProvider="login")
	public void one() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("email");
		
		
		
	}
	/*@org.testng.annotations.DataProvider(name="pro1")
	public Object[][] input() {

		return DataInput.getSheet("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\src\\test\\java\\aravind\\project\\facebook.aravind.xls", "facebook");
		
	}*/
	@org.testng.annotations.DataProvider(name="login")
	public  Object[][] loginTestData() throws IOException {
				
return new Object[][] {
	{GetDataFromWorkbook( 0, 0),
		GetDataFromWorkbook( 0, 1)},
	{GetDataFromWorkbook( 1, 0),
			GetDataFromWorkbook( 1, 1)}
	
};
	
}
}
