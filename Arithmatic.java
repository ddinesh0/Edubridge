package com.Operator;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num = c.nextInt();
		int num0 = c.nextInt();
		System.out.println("Addition:"+(num + num0));
		System.out.println("Subraction:"+(num-num0));
		System.out.println("Multiply:"+(num * num0));
		System.out.println("Modulo:"+(num % num0));
		System.out.println("Division:"+(num / num0));
	}
}
