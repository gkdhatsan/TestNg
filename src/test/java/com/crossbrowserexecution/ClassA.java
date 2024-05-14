package com.crossbrowserexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {

	WebDriver driver;
	@BeforeTest
	private void browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	private void userNameA1() {
    
		driver.findElement(By.id("userame")).sendKeys("najimunisab");
		
		

	}

	@Test
	private void passwordB1() {
		
	
		
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		
	

	}

	@Test

	private void loginC1() {

		driver.findElement(By.id("login")).click();

	}	
	
	
}
