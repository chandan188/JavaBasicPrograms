package com.java.basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		String names[]= {"java", "python", "java", "c#", "python", ".net"};
		 
		 // Solution 1 with for loops 
		
		for(int i= 0 ; i<names.length; i++) {
			for (int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println(("Duplicate element matches with for loop: "+ names[i]));
				}
				
			}
		}
		
		//Using Set Interface and HashSet Class
		
		Set<String> el = new HashSet<String>();
		for (String i:names) {
			if(el.add(i)== false) {
				System.out.println(("Duplicate element matches with hash set: "+ i));
			}
			
		}
		
		Map<String, Integer> storemap=new HashMap<String, Integer>();
		 for(String name : names) {
		  Integer count=storemap.get(name);
		  if(count==null) {
		   storemap.put(name, 1);
		  }else {
		   storemap.put(name,++count);
		  }
		  //get the value from this hashmap
		  Set<Entry<String, Integer>> entryset= storemap.entrySet();
		  for(Entry<String, Integer> entry : entryset) {
		   if (entry.getValue()>1) {
		    System.out.println("Duplicate value is HashMap  :"+entry.getKey());
		    
		   }
		   
		  }
		 }

	}

}
