package com.qa.testcase;

import java.util.Scanner;

public class SortStringArray {

	public static void main(String[] args) {
		String temp = null;
		int n;
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the numof names\n");
		n = s1.nextInt();
		String names[] = new String[n];
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the names keep to array\n");

		// Inserting names inside the empty string array
		for (int i = 0; i < n; i++) {
			names[i] = s2.nextLine();

		}

		// Display of enterd array
		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i] + "  ");
		}System.out.println("");

		// Compairing the array for sorting

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {

					temp = names[i];
					names[i] = names[j];
					names[j] = temp;

				}

			}
		}

		// Sorted array

		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i] + "  ");
		}

	}

}
