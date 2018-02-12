package com.qa.testcase;

import java.util.Arrays;

public class MissingNumberInArrayUsingFun {
	
	public static void main(String[] args) {
		
		int[] array= {1,8,3,5,6,4,7,2,11,9};
		System.out.println(missingNum(array));
	}
		
		public static int missingNum(int[] array){
		 Arrays.sort(array);
		 int sum=0;
		 int sizeA = array.length;
		 int highVal = array[sizeA-1];
		 //System.out.println(highVal);
		 int Total = (highVal * (highVal +1))/2;
		 for (int i : array) {
			 
		 	// System.out.print(i);
		 	 sum =sum + i;
		 }return Total-sum;
			
		 
	}

}
