package com.ericsson.exceptions;

import java.util.Scanner;

class InvalidCredetials extends Exception {

	public InvalidCredetials(String message) {
		super(message);
	}
}

public class Exception7 {
	static void validation(String username, String password) throws InvalidCredetials {
		if (username.equals("ericsson") && password.equals("ericsson123"))
			System.out.println("login success");
		else
			throw new InvalidCredetials("INVALID CREDENTIALS...");
	}

	public static void main(String args[]) throws InvalidCredetials {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Username");
		String a = scan.next();
		System.out.println("Enter password");
		String b = scan.next();
		
			Exception7.validation(a,b);
		
		System.out.println("rest of the code...");
	}
}