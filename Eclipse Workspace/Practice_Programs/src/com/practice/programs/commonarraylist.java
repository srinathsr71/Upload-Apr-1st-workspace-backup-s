package com.practice.programs;


import java.util.ArrayList;
import java.util.List;

//write a java program to find common elements between two arraylist.

public class commonarraylist {

public static void main(String[] args) {
	List<Integer> li1=new ArrayList<Integer>();
	List<Integer> li2=new ArrayList<Integer>();
	li1.add(1);
	li1.add(2);
	li1.add(3);
	li2.add(4);
	li2.add(1);
	li2.add(2);
	for(int i=0;i<li1.size()-1;i++) {
		if(li2.contains(li1.get(i))) {
			System.out.println(li1.get(i));
		}
	}
	
		
}	
}
