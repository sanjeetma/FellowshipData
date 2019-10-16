package com.jdbc;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.jdbc.A");
		Test Obj = new Test() {
			@Override
			public void show() {
				System.out.println("hello");
			}

		};

		Test Obj1 = () -> {
			System.out.println("hiiii");
		};

	}

}
		