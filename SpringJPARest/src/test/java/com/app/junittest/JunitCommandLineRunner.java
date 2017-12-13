package com.app.junittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitCommandLineRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AddTest.class, SubTest.class, MultiplyTest.class, DivTest.class);
		for (Failure fail : result.getFailures()) {
			System.out.println(fail.getMessage() + " " + fail.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All test finishes successfully");

		}
	}

}
