package com.arrays;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int sum=0;
		int a[]=new int[size];
		
		for(int i=0;i<=size-1;i++) {
			a[i]=sc.nextInt();
			}
		for(int i=0;i<=size-1;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);

	}

}
