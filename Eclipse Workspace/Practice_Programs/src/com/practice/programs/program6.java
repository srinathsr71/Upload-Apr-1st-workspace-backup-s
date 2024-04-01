package com.practice.programs;

import java.util.HashSet;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return only not repeated characters in the string.
		//
		
		String sk="srinathseinr";
		HashSet<Character> seencharacter=new HashSet<Character>();
		StringBuilder sb=new StringBuilder();
		for(char c:sk.toCharArray()) {
			if(!seencharacter.contains(c)) {
				seencharacter.add(c);
				sb.append(c);
			}else {
				sb.deleteCharAt(sb.indexOf(Character.toString(c)));
			}
		}
System.out.println(sb);
	}

}
