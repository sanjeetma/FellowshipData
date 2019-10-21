package com.java.bridgelab.junit.suite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestClassOne {
	
	@Test
    public void testOneMethod() {
		ForTest obj=new ForTest();
		int sum=obj.add(20, 30);
		assertEquals(50, sum);
		System.out.println("First test class");
		
	}

}
