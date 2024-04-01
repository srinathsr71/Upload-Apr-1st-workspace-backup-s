package com.practice.programs;

public class prog16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nu=10;
		int t1=0;
		int t2=1;
		for(int i=1;i<=nu;i++) {
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			System.out.println(sum);
		}

	}

}
