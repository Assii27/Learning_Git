package com.arrays;

public class CharArr {
	public static void main(String[] args) {
		String str="Sachin Mali";
//		int length=str.length();
		int i;
		char[] chArr= str.toCharArray();
		for( i=chArr.length-1;i>=0;i--)
		{
			
			System.out.print(chArr[i]);
		}
	}

}
