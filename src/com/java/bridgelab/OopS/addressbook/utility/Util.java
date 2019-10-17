package com.java.bridgelabz.oops.addressbook.utility;

import java.util.Scanner;

public class Util {
	public static Scanner sc = new Scanner(System.in);

	public static int inputInt() {
		return sc.nextInt();
	}

	public static double inputDouble() {
		return sc.nextDouble();
	}

	public static String inputString() {
		return sc.next();
	}
}
