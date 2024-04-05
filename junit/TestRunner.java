package junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {

		//Result result= JUnitCore.runClasses(TestApple.class,TestCountA.class);
		Result result= JUnitCore.runClasses(TestCountA.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure);
		}
		System.out.println("All test cases passed? : "+result.wasSuccessful());
	}

}
