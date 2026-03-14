package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	int counter = 0;
	int retryLimit = 2;//maximum 2 times re execute

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
}