package com.practice.programs;

public class prog20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int j=34521232;
		String s="srinath";
//		int rev=0;
//		while(j!=0) {
//			int n=j%10;
//			rev=rev*10+n;
//			j=j/10;
//		}
//		System.out.println(rev);
		String str="srinath";
    	String reversed=" ";
    	for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
    	System.out.println(reversed);

//	//converting the string to character array
		char[] cf=s.toCharArray();
		int st=0;
		int en=cf.length-1;
		System.out.println(en);
		//swap characters until the pointers meet
		while(st<en) {
			//Swap characters
			char temp=cf[st];
			cf[st]=cf[en];
			cf[en]=temp;
			//move pointers towards each other
			st++;
			en--;
		}
		String reverse=new String(cf);
		System.out.println(cf);
	}

}
