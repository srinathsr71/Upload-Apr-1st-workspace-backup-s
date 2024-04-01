package com.practice.programs;

public class prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ye=2024;
		boolean flag=false;
		if(ye %4==0) {
			if(ye %100==0) {
				if(ye%400==0) {
					flag=true;
				}else {
					flag=false;
				}
			}else {
				flag=true;
			}
		}else {
			flag=false;
		}
		if(flag) {
			System.out.println(ye+"is a leap year");
		}else {
			System.out.println(ye+"is not a leap year");
		}
	}

}
