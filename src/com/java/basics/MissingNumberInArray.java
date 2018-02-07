package com.java.basics;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] a1= {1, 2, 5, 6, 3, 7, 8};
		System.out.println(missNumber(a1));
		
	}
		
		
		public static int missNumber(int[] a1){
			Arrays.sort(a1);
			int sum=0, n, total;;
			n = a1.length-1;
			
			total =(n * (n+1))/2;
			System.out.println("");
			
			for (int i : a1) {
				sum = sum + a1[i];
				
				
			}return total-sum;	
			
			
		}		
		
	
	
}
