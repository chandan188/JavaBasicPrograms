package com.qa.testcase;

public class Factor {

	public static void main(String[] args) {
		
		for(int i =1; i<=100; i++){
			System.out.println(i +": Number is a factor are:r");
			
			for (int j =1; j<=100; j++){
			
			if (i%j==0){
				System.out.println("factors of " + j);
			}
			}
			
		}

	}

}
