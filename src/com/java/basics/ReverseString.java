package com.java.basics;

public class ReverseString {

	public static void main(String[] args) {
		String s ="Java Is Best Language for Selenium";
		int length = s.length();
		System.out.println("String Lenght is : "+length);
		
		String rev ="";
		
		for(int i= length-1; i>=0; i--) {
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());



	}

}
