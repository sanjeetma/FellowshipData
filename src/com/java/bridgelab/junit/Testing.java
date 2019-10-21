package com.java.bridgelab.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing {
	TestingCheck obj=new TestingCheck();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class...execute once");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class...execute once");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test...execute per test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after class...execute per test");
	}
	
	@Test
	public void add() {
		int val=obj.add(10, 20);
		assertEquals(30, val);
		System.out.println("addtion");
		
	}
	@Test
	public void squareNumber() {
		int val=obj.squareNumber(5);
		assertEquals(25, val);
		System.out.println("square");
	}
	public void mul() {
		int val=obj.mul(11, 10);
		assertEquals(110, val);
		System.out.println("multiply");
	}

}
