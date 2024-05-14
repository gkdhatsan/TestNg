package com.reRunKnown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {

	WebDriver driver;
	@BeforeTest
	private void browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@Test(invocationCount=5)
	private void userName() {
    
		driver.findElement(By.id("useame")).sendKeys("najimunisab");
		
		

	}

	@Test
	private void password() {
		
	
		
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		
	

	}

	@Test

	private void login() {

		driver.findElement(By.id("login")).click();

	}	
	
	
	

	
	
}
