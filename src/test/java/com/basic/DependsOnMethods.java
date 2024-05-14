package com.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DependsOnMethods {

	WebDriver driver;

	@BeforeTest
	private void browser() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

	}

	@Test
	private void userName() {

		driver.findElement(By.id("username")).sendKeys("najimunisab");
		
		//Assert.assertTrue(false);

	}

	@Test(dependsOnMethods="userName")
	private void password() {
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		
	Assert.assertTrue(false);

	}

	@Test(dependsOnMethods="password")

	private void login() {

		driver.findElement(By.id("login")).click();

	}

}
