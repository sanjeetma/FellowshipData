package com.java.brigelab.jdbc.crud.preparedstatement.utility;

import java.util.Scanner;

public class ScannerUtil {
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