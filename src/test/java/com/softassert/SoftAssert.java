package com.softassert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssert {

	WebDriver driver;
	
	@Test
	private void chrome() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
    
		driver.findElement(By.id("username")).sendKeys("najimunisab");
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		driver.findElement(By.id("login")).click();
		
		WebElement message = driver.findElement(By.id("username_show"));
		
		String actual = message.getAttribute("value");
	
		String expected = "Hello Najimunisa!";
		
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		
		//soft.assertEquals(actual, expected);
		
		/*soft.assertTrue(false);//actual case failed but it showing pass
		
		soft.assertTrue(true);//pass
		
		soft.assertFalse(false);//pass
		
		soft.assertFalse(true);//actual case failed but it showing pass
*/		
		
		driver.get("https://www.facebook.com/");
		
		soft.assertAll();
	
	}
}
