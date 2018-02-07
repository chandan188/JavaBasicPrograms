package com.java.basics;

public class SwapTwoStringwithOutThrirdvrbl {

	public static void main(String[] args) {
		
		String a = "Hello ";
		String b ="World ";
		System.out.println("String before swapping a is : "+ a);
		System.out.println("String before swapping b is : "+ b);
		
		//append the a the value is HelloWorld
		a= a + b;
		
		b = a.substring(0, a.length()-b.length());
		System.out.println("b value will be after swap :"+ b);
		a = a.substring(b.length());
		
		System.out.println("The value of a is :" + a);



	}

}
