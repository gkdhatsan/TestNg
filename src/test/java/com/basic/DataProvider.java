package com.basic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.reusable.FuntionalLib;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider extends FuntionalLib{
	WebDriver driver;
	
	@Test(dataProvider="login")
	private void login(String user,String pass) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(user); 
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login")).click();
		
	}
	
	@org.testng.annotations.DataProvider(name="login")
	public  Object[][] loginTestData() throws IOException {
				
return new Object[][] {
	{GetDataFromWorkbook("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\test3.xlsx", "rose", 0, 0),
		GetDataFromWorkbook("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\test3.xlsx", "rose", 0, 1)},
	{GetDataFromWorkbook("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\test3.xlsx", "rose", 1, 0),
			GetDataFromWorkbook("C:\\Users\\User\\eclipse-workspace\\DailyTestNG\\test3.xlsx", "rose", 1, 1)}
	
};
	
}
	
	/*@org.testng.annotations.DataProvider
	private Object[][] loginTestData2() {
		
		Object [][] a = new Object[3][2];
		a[0][0]="Greens8767";
		a[0][1]="L4R739";
		a[1][0]="hjvjgi";
		a[1][1]="e54758";
		a[2][0]="najimunisab";
		a[2][1]="Naji@123";
		
		//int [][]v = {{10,20},{20,30}};another way to declare values in array
		
return a;


	}
*/

}
