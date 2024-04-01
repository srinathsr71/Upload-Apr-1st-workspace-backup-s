package com.interviewprograms;
//write a java program to find the number of occurences of a word testing in a given string
public class Occurencesstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ku="Welcome to the software testing world testing testing for automation";
		String word="testing";
		int count=0;
		String a[]=ku.split(" ");
		for(int i=0;i<a.length;i++) {
			if(word.equals(a[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
