package com.comcast.crm.ListenerUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerImplementation implements IRetryAnalyzer
{
    int count=0;
    int limit=5; //how many time we want to try
	public boolean retry(ITestResult result) {
		if (count<limit) {
			count++;
			return true;
		}
		return false;
	}

}
