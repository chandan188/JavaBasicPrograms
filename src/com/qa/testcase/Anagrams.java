package com.qa.testcase;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		
		String str1 = "good";
		String str2 = "oodg";
		
		
		System.out.println(" Both strings are angrams  : " + angramsTest(str1, str2));
		
	}
	
	public static boolean angramsTest(String str1, String str2){
		
		char[] s1= str1.toCharArray();
		char[] s2= str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		return Arrays.equals(s1, s2);
		
	}

}
