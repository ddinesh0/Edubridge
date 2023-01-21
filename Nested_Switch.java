package com.data;

import java.util.Scanner;

public class Nested_Switch {

	    public static void main(String[] args) {
	        //Declaring a variable for switch expression
//	        int year = 3;
//	        int marks = 80;
	    	Scanner ss = new Scanner(System.in);
	    	System.out.println("Enter the year");
	    	int year = ss.nextInt();
	    	System.out.println("Enter the marks");
	    	int marks = ss.nextInt();
	        
	        switch(year) //Switch expression
	        {
	            //Case statements
	            case 1: System.out.println("Only for 3rd year students");
	                break;
	            case 2: System.out.println("Only for 3rd year students");
	                break;

	            case 3: switch(marks)  
	            {
	                        case 50: System.out.println("You are not eligible for scholarship");
	                            break;
	                        case 80: System.out.println("Congrats!!!!! you are eligible for scholarship");
	                            break;
	                    }
	                break;
	            //Default case statement
	            default: System.out.println("Please enter valid year");
	        }
	    }
	}


