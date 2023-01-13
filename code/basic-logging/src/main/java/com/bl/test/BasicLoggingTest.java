package com.bl.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicLoggingTest {
	private static final Logger logger = LogManager.getLogger(BasicLoggingTest.class);

	public static void main(String[] args) {
		logger.info("Good Evening");
		int a = 10;
		int b = 20;
		int sum = a + b;

		logger.debug("a : {}, b: {} and sum : {}", a, b, sum);
	}
}
