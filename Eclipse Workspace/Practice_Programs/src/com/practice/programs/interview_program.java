package com.practice.programs;

public class interview_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to print the output in this formate 00000 1111 222 based on the given array 
		int[] array={0,0,1,1,2,0,0,2,1,0,1,2};
		int count=0,count1=0,count2=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==0) {
				count++;
			}else if(array[i]==1) {
				count1++;
			}else if(array[i]==2) {
				count2++;
			}
		}
		
		for(int i=0;i<count;i++) {
			System.out.print("0");
		}
		System.out.print(" ");
		for(int i=0;i<count2;i++) {
			System.out.print("2");
		}
		System.out.print(" ");
		for(int i=0;i<count1;i++) {
			System.out.print("1");
		}
		System.out.print(" ");
		
		
	}

}
