package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DependsOnGroups {

	WebDriver driver;

	@BeforeTest
	private void browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@Test(groups="@Smoke")
	private void userName() {
    
		driver.findElement(By.id("userame")).sendKeys("najimunisab");
		
		//Assert.assertTrue(false);

	}

	@Test(enabled = false,groups="@Sanity")
	private void password() {
		
		System.out.println("@Sanity");
		
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		
	

	}

	@Test(groups ="@Formal")

	private void login() {
System.out.println("@Formal");
		driver.findElement(By.id("login")).click();

	}

}
