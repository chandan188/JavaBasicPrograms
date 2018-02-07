package com.java.basics;

public class StrinManipulation {

	public static void main(String[] args) {
		
		String  a = "Hi this Chandan at Polycom Desk!!!!";
		String  a1 = "Hi this Chandan at Polycom Desk!!!!";
		String  a2 = "Hi this chandan At POlycom desk!!!!";
		System.out.println(a.length()); // lenght odf current string
		System.out.println(a.charAt(5));// exact at the 5th index
		System.out.println(a.indexOf("o"));
		System.out.println(a.indexOf("a"));
		
		System.out.println(a.indexOf("a", a.indexOf("a")+1));
		System.out.println(a.indexOf("yyyy"));// no string available so it return -1
		System.out.println(a.indexOf("at"));
		
		System.out.println(a.equals(a1)); // return is boolean type
		System.out.println(a.equalsIgnoreCase(a2));// it will ignore case sensitive
		
		System.out.println(a.substring(3, 15));
		
		String b = "   hello  India  ";
		String c = "hi I am Chandan das";
	
		System.out.println(b.trim());
		System.out.println(c.replace(" ", ""));
		
		String date=  "01-05-1989";
		System.out.println(date.replace("-", "/"));
		
		String data = " Hello java we will";
		String testdata[] = data.split(" ");
		for (int i=0; i<testdata.length; i++) {
			System.out.println(testdata[i]);
			
		}
		
	
	

	}

}
