package com.qa.testcase;

public class SwitchCasemissingBreak {
	public static void main(String[] args) {
		for(int i =0; i<=5; i++) {
			
			switch(i){
				case 1:
				case 2:
					System.out.println("i is theless than 3");
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("value reached 5");
					break;
				default :
					System.out.println("value is more than 5");
			}
			
		}
	}

}
