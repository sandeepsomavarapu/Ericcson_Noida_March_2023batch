package com.ericsson.exceptions;

import java.util.Scanner;

class Exception1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value for devision");
		int a = scan.nextInt();
		System.out.println("Enter Second value for devision");
		int b = scan.nextInt();
		try {
			int c = a / b;
			System.out.println("division is " + c);
			
		} catch (ArithmeticException e) {
			//System.out.println("dont enter zero as denominator");
			//System.out.println(e.getMessage());
			e.printStackTrace();

		} finally {
			System.out.println("executes always...");
			scan.close();
		}
		System.out.println("remaining 1000 lines of code");
	}
}