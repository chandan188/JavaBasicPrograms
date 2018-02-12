package com.qa.testcase;

import java.util.Scanner;

public class FloydsTriangle {
	
	static int num2=1;
	
	public static void main(String[] args) {
		
		int num=1, n;
		
		Scanner sc = new Scanner(System.in)	; // Expecting Input at console
		n =sc.nextInt();
		
		for (int i =1; i<=n; i++){
			for (int j =1 ; j<=i; j++){
				System.out.print(num+ " ");
				num++;
				
			}
			System.out.println("");
		}
		
		//Hard code
		
		System.out.println("Hard code");
		
		for (int i =1; i<=10; i++){
			for (int j =1 ; j<=i; j++){
				System.out.print(num2+ " "	);
				num2++;
				
			}
			System.out.println("");
		}
	}

}
