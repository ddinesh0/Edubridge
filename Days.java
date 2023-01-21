package com.data;

import java.util.Scanner;

public class Days {

	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
	 String[] weekdays= { "Monday", "Tuesday", "Wednesday","Thursday", 
	"Friday","Saturday","sunday" };
	 String week = sc.nextLine();
	 for (int i = 1; i <=7; i++) {
	 System.out.println(i + " weekday - "+ weekdays[i - 1]);
	 }
	 }
		} 


import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	//relational operators
	//<,>,>=,<=,!=,==,	comparing to variables or values
	//relational operator returntype is boolean
		int num1=10,num2=20;
		Scanner scanner=new Scanner(System.in);
		//in stands for object of InputStream
		//num1=scanner.nextInt();
		//num2=scanner.nextInt();
		System.out.println("num1<num2-->"+(num1<num2));
		System.out.println("num1==num2-->"+(num1==num2));
		System.out.println("num1>num2-->"+(num1>num2));
		System.out.println("num1!=num2-->"+(num1!=num2));
		System.out.println("num1<=num2-->"+(num1<=num2));
		System.out.println("num1>=num2-->"+(num1>=num2));
}
}


public class LogicalOperatorExample {

	public static void main(String[] args) {
	//logical operator 
		//&& || ! --to combine the two relational operators
		//to combine to conditions
		int num1=10,num2=20,num3=0;
		Scanner scanner=new Scanner(System.in);
		//in stands for object of InputStream
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		System.out.println("num1<num2-->"+(!(num1<num2) || !(num1<num3)));
		//                                 (!(100<50) || !(100<150))
		//                                   (!false) ||  !(true) )
		/*                                      true   || false
		 * System.out.println("num1==num2-->"+(num1==num2));
		 * System.out.println("num1>num2-->"+(num1>num2));
		 * System.out.println("num1!=num2-->"+(num1!=num2));
		 * System.out.println("num1<=num2-->"+(num1<=num2));
		 * System.out.println("num1>=num2-->"+(num1>=num2));
		 */
}
}
import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
	//logical operator 
		//&& || ! --to combine the two relational operators
		//to combine to conditions
		int num1=10,num2=20,num3=0;
		Scanner scanner=new Scanner(System.in);
		//in stands for object of InputStream
		num1=scanner.nextInt();
		if(num1>10000 && num1<20000)
			//20000>10000 && 20000<20000
			System.out.println("num1 is between 10 to 20 thousand");
		else
			System.out.println("num1 is not bet 10 and 20");
}
}
}

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		char ch;
		Scanner scanner=new Scanner(System.in);
		//in stands for object of InputStream
		ch=scanner.next().charAt(0);
		if(ch>=65&& ch<=90 )//l>='A'
		{
			System.out.println("upper case");
			System.out.println(ch);
	}else if(ch>=97 && ch<=122)
			System.out.println("lower case");
		else
			System.out.println("number or symbol");
}
}

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		char ch;
		Scanner scanner=new Scanner(System.in);
		//in stands for object of InputStream
		ch=scanner.next().charAt(0);
		if(ch>=65&& ch<=90 )//l>='A'
		{
			System.out.println("upper case");
			System.out.println((char)(ch+32));
	}else if(ch>=97 && ch<=122)
			System.out.println("lower case-->"+((char)(ch-32)));
		else
			System.out.println("number or symbol");
}
}
import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		System.out.println("1-English \n 2-Hindi");
		int option;
		System.out.println("Enter 1 or 2");
		Scanner scanner=new Scanner(System.in);
		option=scanner.nextInt();
		switch(option)//1
		{
		case 1:System.out.println("English");
		break;
		case 2:System.out.println("Hindi");
		break;
		default: System.out.println("Enter a valid option 1 or 2 only");
		break;
		case 3: System.out.println("Kannada");
		break;
		}
		
		System.out.println("end of main");
		
	}
}

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		System.out.println("1-square \n 2-Rectangle");
		int option,breadth,len,side;
		System.out.println("Enter 1 or 2");
		Scanner scanner=new Scanner(System.in);
		option=scanner.nextInt();
		switch(option)//1
		{
		case 1:
			System.out.println("Enter the side");
			side=scanner.nextInt();
			System.out.println("the area of square is-->"+(side*side));
		break;
		case 2:System.out.println("Enter the length and breadth");
		len=scanner.nextInt();
		breadth=scanner.nextInt();
		System.out.println("area of rectangle-->"+(len*breadth));
		break;
		default: System.out.println("Enter a valid option 1 or 2 only");
		break;
		case 3: System.out.println("Kannada");
		break;
		}
		
		System.out.println("end of main");
		
	}
}
import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		System.out.println("+-add \n - sub");
		int num1,num2;
		char option;
		System.out.println("Enter + or -");
		Scanner scanner=new Scanner(System.in);
		option=scanner.next().charAt(0);
		switch(option)
		{
		case '+':
			System.out.println("Enter the num1,num2");
			num1=scanner.nextInt();
			num2=scanner.nextInt();
			System.out.println("the addition result-->"+(num1+num2));
		break;
		case '-':System.out.println("Enter the num1,num2");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println("the sub result is-->"+(num1-num2));
		break;
		default: System.out.println("Enter a valid option 1 or 2 only");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}
}
import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		String day;
		System.out.println("Enter the name of the day");
		Scanner scanner=new Scanner(System.in);
		day=scanner.next();
		switch(day)
		{
		case "Monday":
			System.out.println("Start of the week");
			break;
		case "Wed":
			System.out.println("Mid of the week");
			break;
		case "Sun":
			System.out.println("WeekEnd");
				break;
		
		default: System.out.println("Enter a valid name of day");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}
}


import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		char letter;
		System.out.println("Enter the character to check the vowel");
		Scanner scanner=new Scanner(System.in);
		letter=scanner.next().charAt(0);
		switch(letter)
		{
		case 'A':
			System.out.println("vowel");
			break;
		case 'E':
			System.out.println("vowel");
			break;
		case 'I':
			System.out.println("Vowel");
				break;
		case 'O':
			System.out.println("Vowel");
				break;
		case 'U':
			System.out.println("Vowel");
				break;
		case 'a':
			System.out.println("Vowel");
				break;
		case 'e':
			System.out.println("Vowel");
				break;
		case 'i':
			
			System.out.println("Vowel");
				break;
		case 'o':
			System.out.println("Vowel");
				break;
		case 'u':
			System.out.println("Vowel");
				break;
		default: System.out.println("Consonent");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}
}
import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		char letter;
		System.out.println("Enter the character to check the vowel");
		Scanner scanner=new Scanner(System.in);
		letter=scanner.next().charAt(0);
		switch(letter)
		{
		case 'A':
			
		case 'E':
			
		case 'I':
			
		case 'O':
				case 'U':
			
		case 'a':
			
		case 'e':
			
		case 'i':
		
		case 'o':
		
		case 'u':
			System.out.println("Vowel");
				break;
		default: System.out.println("Consonent");
		break;
		
	
		}
		
		System.out.println("end of main");
		
	}
}


