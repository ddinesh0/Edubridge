package com.data;

import java.util.Scanner;

public class Marklist {

	public static void main(String[] args) {
		
		int n,total = 0,percentage,division;
		String s="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll Number of the student");
		int Rollno = sc.nextInt();
		System.out.println("Enter the Student name");
		String Name = sc.next();
		System.out.println("Physics Mark-");
		int Marks = sc.nextInt();
		System.out.println("Chemistry Mark-");
		int Marks2 = sc.nextInt();
		System.out.println("Computer Application Mark-");
		int Marks3 = sc.nextInt();
		total=Marks+Marks2+Marks3;
		percentage = total/3;
		System.out.println("Total="+total);
		System.out.println("Percentage="+percentage);
		if(total>=200 && total<=300)
		{
			System.out.println("Division = FIRST");
		}
		else if(total>=100 && total<=199)
		{
			System.out.println("Division = SECOND");
		}
		else 
		{
			System.out.println("Division = THIRD");
		}
		}
	}


