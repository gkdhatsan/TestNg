 package com.reRunUnknown;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class AutoFind  implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		
		IRetryAnalyzer retryAnalyzer = annotation.getRetryAnalyzer();
		
		if(retryAnalyzer==null) {
			
			
			annotation.setRetryAnalyzer(Rerun.class);
		}
		
		
	}

}
