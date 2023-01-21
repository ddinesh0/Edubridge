package com.Operator;

import java.util.Scanner;

public class Neither {
	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.println("Enter the value");
		int i = type.nextInt();
		System.out.println("Enter the value");
		int j = type.nextInt();
		if(i==j) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are different");
		}
	}

}
