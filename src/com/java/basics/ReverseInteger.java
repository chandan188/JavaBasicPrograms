package com.java.basics;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(a);
		int n =123;
		String num = String.valueOf(n);
		String rev = "";
		for (int i = num.length()-1; i>=0; i--)
		{
			rev = rev+ num.charAt(i);
			
		}
		System.out.println(Integer.valueOf(rev));
	}

}
