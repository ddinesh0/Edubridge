package com.Operator;

import java.util.Scanner;

public class Logical {
	public static void main(String[] args) {
		boolean bool1 = true, bool2 = false;

		System.out.println("bool1 && bool2 = " + (bool1 && bool2));

		System.out.println("bool1 || bool2 = " + (bool1 | bool2));

		System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));

	}
}
