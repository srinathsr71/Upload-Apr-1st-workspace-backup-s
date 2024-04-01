package com.practice.programs;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {0,1,2,1,2,0,2,1,1,1,0,0,2,1};
		int count=0,count4=0,count5=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}else if(arr[i]==1) {
				count4++;
			}else if(arr[i]==2) {
				count5++;
			}
		}
		for(int i=0;i<count5;i++) {
			System.out.print("2");
		}
		System.out.print(" ");
		for(int i=0;i<count4;i++) {
			System.out.print("1");
		}
		System.out.print(" ");
		for(int i=0;i<count;i++) {
			System.out.print("0");
		}
	}

}
