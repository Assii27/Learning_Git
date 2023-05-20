package com.arrays;

public class FindMaxValue {
	public static void main(String [] args) {
		
		int list[]= {10,20,11,45,65,65,66,90,07,24,27,122};
		
		int findMax = 0;
		
		for(int i=1;i<list.length;i++)
		{
		
			if(list[i]>findMax)
			{
				findMax=list[i];
			}
		}
		
		System.out.println("Max Value from List is: "+ findMax);
	}

}
