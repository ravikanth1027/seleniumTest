package com.rerun.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int minTry =0;
	int maxTry =2;
	
	public boolean retry(ITestResult result) {
		
		if(minTry<=maxTry){
			System.out.println("Failed TestCase:"+ result.getTestName());
			System.out.println("Retrying for:" + (minTry+1));
			minTry++;
			return true;
		}
		return false;
	}

}
