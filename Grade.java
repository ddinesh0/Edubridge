package com.data;

import java.util.Scanner;

public class Grade {
	
public static void main(String[] args) {
	char grade;
	System.out.println("Enter the Grade");
	Scanner scanner=new Scanner(System.in);
	grade=scanner.next().charAt(0);
	System.out.println("you have choosen:");
	switch(grade)
	{
	case 'E':
	System.out.println("Excellent");
	break;
	case 'V':
		System.out.println("Very Good");
		break;
	case 'G':
		System.out.println("Good");
		break;
	case 'A':
		System.out.println("Average");
		break;
	case 'F':
		System.out.println("Fail");
		break;
		default:
			System.out.println("Invalid data, Enter Valid data! ");
	}
		
	}
	
}

