package com.accionlabs.javacode;

import java.util.Scanner;

public class CircularRotation {

	public static void main(String[] args) {
		System.out.println("Enter Strings :- ");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();

		// System.out.println(s1 + " " + s2);
		if (s1.length() != s2.length()) {
			System.out.println("no");
			return;
		}

		if (s1.equals(s2)) {
			System.out.println("yes");
			return;
		}

		for (int i = 0; i < s1.length() - 1; i++) {
			String temp = s1.substring(i + 1) + s1.substring(0, i + 1);
			System.out.println(temp);
			if (temp.equals(s2)) {
				System.out.println("yes");
				return;
			}
		}

		System.out.println("no");
		return;

	}

}
