package com.crossbrowserexecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassC {
	
		WebDriver driver;
		@BeforeTest
		private void browser() {

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			driver.get("https://adactinhotelapp.com/");

		}

		@Test(priority =1)
		private void userNameA3() {
	    
			driver.findElement(By.id("userame")).sendKeys("najimunisab");
			
			

		}

		@Test(priority =2)
		private void passwordB3() {
			
		
			
			driver.findElement(By.id("password")).sendKeys("Naji@123");
			
		

		}

		@Test(priority =3)

		private void loginC3() {

			driver.findElement(By.id("login")).click();

		}	
		
		

}
