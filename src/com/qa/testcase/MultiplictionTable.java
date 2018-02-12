package com.qa.testcase;

import java.util.Scanner;

public class MultiplictionTable {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i;
		n =sc.nextInt();
		for (i =1; i <=10; i++) {
			System.out.println( n + " * " + i + " = " +( n*i));
		}
	}
}
