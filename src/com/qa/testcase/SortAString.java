package com.qa.testcase;

import java.util.Arrays;

public class SortAString {

	public static void main(String[] args) {
		String str= "kufgtopvbdezas";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String sortedArray = new String(ch);
		System.out.println(sortedArray);

	}

}
