package com.de;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class demo2{
	
	public static void main(String[] args) {
		String str="java collections";
		HashMap<Character,Integer> charcountMap= new HashMap<Character,Integer>();
		char[] strarray=str.toCharArray();
		for(char c: strarray) {
			if(charcountMap.containsKey(c)) {
				charcountMap.put(c, charcountMap.get(c)+1);
			}else {
				charcountMap.put(c, 1);
			}
			
			}
		for(char c:strarray) {
			if(charcountMap.get(c)>1) {
				System.out.println("FirstRepeated Character in"+str+"'is'"+c+'"');
				break;
			}
			}
		
		}
}
