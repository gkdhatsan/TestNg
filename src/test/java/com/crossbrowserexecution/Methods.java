package com.crossbrowserexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
	}

	@Test
	private void edge() {
		
		
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("najimunisab");
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		driver.findElement(By.id("login")).click();
		
	}

	@Test(enabled= false)
    
	private void mozilla() {
		
		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.id("username")).sendKeys("najimunisab");
		driver.findElement(By.id("password")).sendKeys("Naji@123");
		driver.findElement(By.id("login")).click();

	}	
	
	
}
