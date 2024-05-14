package com.reRunKnown;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun implements IRetryAnalyzer {
	
    int a=0;
    int b=5;

	public boolean retry(ITestResult arg0) {
		
		if(a<b) {
			
			a++;
			
			return true;
			
			
		}

		return false;
	}
	
}
	


