package com.Operator;

import java.util.Scanner;

public class AgeMon {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = e.nextInt();
		if (num >= 100 && num <= 200) {
			System.out.println("the number is between the 100 to 200 ");
		} else {
			System.out.println("Invalid");
		}

	}

}
