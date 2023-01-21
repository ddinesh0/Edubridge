package com.Operator;

import java.util.Scanner;

public class Relation {
	public static void main(String[] args) {
		Scanner dd = new Scanner(System.in);
		System.out.println("Enter A value: ");
		int a = dd.nextInt();
		System.out.println("Enter B value");
		int b = dd.nextInt();
		System.out.println("A is Greater then b: "+(a>b));
		System.out.println("A is Lesser then b: "+(a<b));
		System.out.println("A is Greater then equal to b: "+(a>=b));
		System.out.println("A is Lesser then equal to b: "+(a<=b));
		System.out.println("A is Equal to b: "+(a==b));
		System.out.println("A is Not equal to b: "+(a!=b));
	}

}
