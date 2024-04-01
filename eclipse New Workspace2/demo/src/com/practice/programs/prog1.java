package com.practice.programs;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		try {
		int n=sc.nextInt();
		System.out.println("the entered number " +n+ " is integer");
	}
		catch(Exception e) {
			System.out.println("the entered number is not an integer");
		}	
	}
}
