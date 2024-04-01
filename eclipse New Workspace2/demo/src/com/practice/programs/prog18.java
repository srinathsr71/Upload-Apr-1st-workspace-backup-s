package com.practice.programs;

import java.util.HashSet;
import java.util.Set;

public class prog18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int s=223411343;
//		String sr="srinathss";
		int[] ar= {2,2,3,4,5,6,7,2,1,2,3,5,5,3,2};
		String [] ar1= {"f","f","e","a","a","r","r"};
//		int count=0;
//		int index=0;
//		while(index<sr.length()) {
//			count++;
//			index++;
//		}
//		System.out.println(count);
		
//	Set<Character> uch=new HashSet<Character>();
//	for(char c:sr.toCharArray()) {
//		uch.add(c);
//	}
//	System.out.println("Number of characters:"+uch.size());
//	
//	Set<Integer> us=new HashSet<Integer>();
//	String sd=String.valueOf(s);
//	for(int di:sd.toCharArray()) {
//		us.add(di);
//	}
//	System.out.println("number of integers:"+us.size());	
		Set<String> uch=new HashSet<>();
		for(String c:ar1) {
			uch.add(c);
		}
		System.out.println("Number of characters:"+uch.size());
		
		Set<Integer> us=new HashSet<Integer>();
		for(int di:ar) {
			us.add(di);
		}
		System.out.println("number of integers:"+us.size());		
		
		
		
		
	}

}
