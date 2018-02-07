package com.java.basics;

public class DumpQA {

	public static void main(String[] args) {
		Hello(null);

	}
	
	public static void Hello(String s) {
		System.out.println("hi I m inside ");
	}
	
	public static void Hello(Object  os) {
		System.out.println("hi I m inside os ");
	}

}
