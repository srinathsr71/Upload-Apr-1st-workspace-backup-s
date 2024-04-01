package com.practice.programs;

import java.util.Scanner;

public class prog2 {
	public static void main(String[] args) {
		Scanner sf=new Scanner(System.in);
		System.out.println("enter the two numbers");
//		try {
//			int j=sf.nextInt();
//			System.out.println("Entered number of" +j+ "is integer");
//			int h=sf.nextInt();
//			System.out.println("Entered numbers are integers perform addition of numbers");
//			int a=j+h;
//			System.out.println("the addition of two numbers is " +a+ " ");
//		}
//		catch(Exception e) {
//			System.out.println("Entered number are not integers please enter integer numbers");
//		}
		
		try {
			int j,h;
			String input1=sf.next();
			j=Integer.parseInt(input1);
			String input2=sf.next();
			h=Integer.parseInt(input2);
			System.out.println("Entered numbers are integers perform addition of numbers");
			int a=j+h;
			System.out.println("the addition of two numbers is " +a+ " ");
		}
		catch(Exception e) {
			System.out.println("Entered number are not integers please enter integer numbers");
		}		
	}

}
