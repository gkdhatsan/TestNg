package com.hardassert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {

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
		
		//Assert.assertEquals(actual, "Hello Najimunisab!");//automation come manual
		
		/*boolean contains = actual.contains("hello");//fully automation
		System.out.println(contains);//automation
		Assert.assertTrue(contains);// automation
*/		
		//Assert.assertTrue(true);// passs---- manual
		
		//Assert.assertTrue(false);//manual
		
		//Assert.assertFalse(false);//pass --manual
		
		//Assert.assertFalse(true);//fail-- manual
		
		boolean contains = actual.contains("Hello");//automation come manual
		System.out.println(contains);//automation
		//Assert.assertTrue(contains);// automation
		
		//Assert.assertFalse(contains);//pass--automation
		
		Assert.assertFalse(contains);//fail---- automation
		
	
		driver.get("https://www.facebook.com/");
		
		
		
	}

	
	
}
