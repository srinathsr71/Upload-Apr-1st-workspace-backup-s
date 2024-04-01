package com.practice.programs;

import java.util.Scanner;

public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gs=new Scanner(System.in);
		System.out.println("Enter the float numbers");
		try {
			float j,k;
			String s1=gs.next();
			j=Float.parseFloat(s1);
			String s2=gs.next();
			k=Float.parseFloat(s2);
			System.out.println("Entered numbers are float number perform multiplication");
			float l=j*k;
			System.out.println("The multiplication of float numbers is " + l + "");
		}catch(Exception e) {
			System.out.println("Entered numbers are not float numbers please enter float numbers");
		}
	}

}
