package com.basic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	

	public void onStart(ITestContext arg0) {
		System.out.println("1 onStart");
		long onStart = System.currentTimeMillis();
		System.out.println(onStart);

	}
	public void onTestStart(ITestResult arg0) {
		System.out.println("2 onTestStart");
		long onTestStart = System.currentTimeMillis();
		System.out.println(onTestStart);

	}
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("3 onTestSuccess");
		long onTestSuccess = System.currentTimeMillis();
		System.out.println(onTestSuccess);

	}
	
	public void onTestFailure(ITestResult arg0) {

		System.out.println("4 onTestFailure");

		System.out.println("take screenshot onTestFailure ");

	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		System.out.println("6 onTestFailedButWithinSuccessPercentage");

		System.out.println("take screenshot FailedButWithinSuccessPercentage ");

	}
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("5 onTestSkipped");

		System.out.println("take screenshot onTestSkipped ");

	}
	
	public void onFinish(ITestContext arg0) {
		System.out.println("7 onFinish");
		long onFinish = System.currentTimeMillis();
		System.out.println(onFinish);

	}

}
