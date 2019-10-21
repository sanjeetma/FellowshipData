package com.java.bridgelab.junit.suite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestClassTwo {

	@Test
	public void testMethodTwo() {
		ForTest obj=new ForTest();
		int sum=obj.add(20, 30);
		assertEquals(60, sum);
		System.out.println("second Test Class");
	}
	@BeforeClass
	public static void show() {
		System.out.println("Before class");
	}
	
}
