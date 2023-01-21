package com.Operator;

import java.util.Scanner;

public class Assign_Opp {
	public static void main(String[] args) {
		int modulo = 0, add = 0, mul = 0, sub = 0;
		float div = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter five number : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		add = num1 += 5; // 4+5
		sub = num2 -= 5; // 3-5
		mul = num3 *= 5; // 5*5
		div = num4 /= 5; // 6/5
		modulo = num5 %= 5; // 7%5
		System.out.println(" addition + " + add);
		System.out.println(" subtraction - " + sub);
		System.out.println(" multiplication * " + mul);
		System.out.println(" division / " + div);
		System.out.println(" modulo % " + modulo);
	}
}
