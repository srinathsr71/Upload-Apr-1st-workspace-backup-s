package com.practice.programs;

import java.util.HashSet;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to print the vowels in the string with out duplicate
		//Explanation:-we are checking if the current character c is a vowel.
		//The indexOf() method searches for the index of the character c within the string "aeiouAEIOU". 
		//If c is found in the string, indexOf() returns its index (which is greater than or equal to 0), 
		//indicating that c is a vowel. If c is not found, indexOf() returns -1, indicating that c is not a vowel.
		//If the condition indexOf(c) != -1 evaluates to true (meaning c is a vowel), 
		//we add the character c to the vowelsSet.
		String sp="PavAna kUumar";
		
		HashSet<Character> vowels=new HashSet<Character>();
		for(char c:sp.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels.add(c);
			}

		}
		System.out.print(vowels);
		

	}

}
