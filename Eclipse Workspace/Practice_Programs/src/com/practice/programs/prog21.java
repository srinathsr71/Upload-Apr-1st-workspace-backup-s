package com.practice.programs;

public class prog21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=123;
//		int rev=0;
//		int actual=num;
//		while(num!=0) {
//			int n=num%10;
//			rev=rev*10+n;
//			num=num/10;
//			
//		}
//		if(actual==rev) {
//			System.out.println(actual + " is a palindrome");
//		}else {
//			System.out.println(actual + " is not a palindrome");
//		}
		String ste="radar";
		int left=0;
		int right=ste.length()-1;
		boolean isp=true;
		while(left<right) {
			if(ste.charAt(left)!=ste.charAt(right)) {
				isp=false;
				break;
			}
			left++;
			right--;
		}
		if(isp) {
			System.out.println(ste + "is a palindrome");
		}else {
			System.out.println(ste + "is not a palindrome");
		}
	}

}
