package com.practice.programs;

public class program4 {
	
	public static void main(String[] args) {
		//"my NaME is PaaAvVvAaAnN" --> "MY nAme IS pAAaVvVaAaNn".
		String s="my NaME is PaaAvVvAaAnN";
//		System.out.print(s);
//		String s1=s.toLowerCase();
//		System.out.print(s1);
//		for(int i=0;i<s.length();i++) {
//			System.out.print(s);
//		}
		char[] c=s.toCharArray();
		System.out.println(c);
		for(int i=0;i<c.length;i++) {
			char cs=c[i];
			if(Character.isLowerCase(cs)) {
				c[i]=Character.toUpperCase(cs);
			}else if(Character.isUpperCase(cs)) {
				c[i]=Character.toLowerCase(cs);
			}
			
		}
		System.out.print(c);

	
	}

}
