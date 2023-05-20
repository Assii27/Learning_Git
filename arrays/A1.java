package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class A1 {

	public static void main(String[] args) {


	String [] colur= {"Red","Blue","White","Green"};
		/* Method :1 */
		List list=Arrays.asList(colur);
		System.out.println(list);

		// Asif Updated this file and update

		//Third Change and update from vs code 
 
 
		/* Method 2:  */
//		List<String> l= new ArrayList<>();
//		Collections.addAll(l,colur);
//		System.out.println(l);
 

		/* Method 3: */
		List<String> l=new ArrayList<String>();
		for (String string : colur) {
			l.add(string);
//			
			System.out.println(l);
			
//		}
//		System.out.println(l);
		

	
	
	
//    Integer [] array1= {1,2,3,4,5};
//    Integer [] array2= {7,8,3,4,6};
//    
//    HashSet<Integer> h= new HashSet<>();
//    List<Integer> l=Arrays.asList(array1);
//    List<Integer> l1=Arrays.asList(array2);
//    h.addAll(l);
//    h.addAll(l1);
//    
//    List<Integer> finallist=new ArrayList<Integer>();
//    for (Integer number : h) {
//    	if(l.contains(number)&& l1.contains(number)) {
//    		finallist.add(number);
//    	}
//		
//	}
//    
//    System.out.println(h);
//    System.out.println(finallist);
		
		
} 
	

}
