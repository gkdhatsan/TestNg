package com.basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Execution {

	@BeforeSuite
	private void m1() {
		
System.out.println("@BeforeSuite");
	}
	@BeforeTest
	private void m2() {
	System.out.println("@BeforeTest");	
	}
	@BeforeClass
private void m3() {
		System.out.println("@BeforeClass");	
	}
	
	@BeforeMethod
private void m4() {
		//System.out.println("@BeforeMethod");
		System.out.println("test start time");
		
}
	@Test
private void m5() {
		System.out.println("@Test");
}
	@Test
private void m6() {
		System.out.println("@Test");	
		
}
	@Test
	private void m11() {
		System.out.println("@Test");	
		
	}
		
@AfterMethod
private void m7() {
	//System.out.println("@AfterMethod");
	System.out.println("test end time");
}
@AfterClass
private void m8() {
	System.out.println("@AfterClass");
}
@AfterTest
private void m9() {
	System.out.println("@AfterTest");
}
@AfterSuite
private void m10() {
	System.out.println("@AfterSuite");
}


	
	
	
}
