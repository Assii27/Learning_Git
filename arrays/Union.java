package com.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Union {
		
	
	public static void Union(int a[],int []b)
	{
		Set <Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
			
		}
		for(int i=0;i<b.length;i++)
		{
			set.add(b[i]);
		}
		System.out.println(set.toString());
	}
	public static void Intersection(int a[],int []b)
	{
		Set <Integer> set=new HashSet<>();
		if(a.length>b.length)
		for(int i=0;i<b.length;i++)
		{
			
			if(b[i]==a[i])
			{
				set.add(b[i]);
			}
		}
		else
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					set.add(a[i]);
				}
			}	
		}
		System.out.println(set.toString());
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the array size of first array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array size of second array");
		int s=sc.nextInt();
		int b[]=new int[n];
		
		for(int i=0;i<s;i++)
		{
			b[i]=sc.nextInt();
		}
		
	//	Union(arr,b);
		Intersection(arr,b);
	}

}
