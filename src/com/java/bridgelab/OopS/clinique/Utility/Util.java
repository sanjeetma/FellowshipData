package com.java.bridgelabz.oops.clinique.Utility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	public static boolean verifyMobile(String mobile) {
		boolean flag = false;
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		Matcher m = p.matcher(mobile);
		if (m.find()) {
			flag = true;
		}
		return flag;
	}

}
