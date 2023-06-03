import java.util.HashSet;
import java.util.Set;

public class Sorting {
	
	public static void SortingbyOneloop( int arr[])
	{

		 int n = arr.length;
		 System.out.print("\n***********************************************");
		 System.out.print("\nArray before sorting : ");
	        for (int i = 0; i <n ; i++)
	        {
	        	System.out.print(" "+arr[i]);
	        }
	        System.out.print(" \n**********************************\n");
	            for (int j = 0; j <n-1 ; j++)
	                {
	            	
	            	
	            		if (arr[j] > arr[j + 1]) 
	                	{
	                    arr[j] = arr[j]+arr[j+1];
	                    arr[j+1] = arr[j]-arr[j+1];
	                    arr[j] =arr[j]-arr[j+1];
	                    j=-1;
	                	}
	            		
	                }
	        
	        System.out.print("\nSorted array: ");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	}

	
	public static int[] Sorting( int arr[])
	{

		 int n = arr.length;
	        for (int i = 0; i <= n ; i++)
	        {
	            for (int j = 0; j <n - i-1 ; j++)
	                {
	            		if (arr[j] > arr[j + 1]) 
	                	{
	                    arr[j] = arr[j]+arr[j+1];
	                    arr[j+1] = arr[j]-arr[j+1];
	                    arr[j] =arr[j]-arr[j+1];
	                	}
	            		
	            		
	                }
	           
	        }
	     //   System.out.print("Sorted array: ");
	     //   for(int i=0;i<n;i++)
	     //   {
	    //    	System.out.print(arr[i]+" ");
	    //    }
	        return arr;
	}

	
	 private static void sortBinaryArray(int[] inputArray)
	    {
	        int left = 0;
	         
	        int right = inputArray.length-1;
	        
	        System.out.print("\nInput Array Before Sorting : ");
	        
	        for(int i=0;i<inputArray.length;i++) 	   	
	        System.out.print((inputArray[i]+" "));
	        
	         
	        while (left < right)
	        {
	            if (inputArray[left] == 1)
	            {
	                //Swapping
	                 
	                inputArray[right] = inputArray[right] + inputArray[left];
	                inputArray[left] = inputArray[right] - inputArray[left];
	                inputArray[right] = inputArray[right] - inputArray[left];
	                 
	                right--;
	            }
	            else
	            {
	                left++;
	            }
	        }
	        System.out.print("\nInput Array After Sorting : ");
	        for(int i=0;i<inputArray.length;i++) 
	        System.out.print((inputArray[i])+" ");
	    }
	 
	 public static void intersection(int []a,int []b)
	 {
	//	 System.out.println("\nintersection: ");
		 Set<Integer> set=new HashSet<>();
		 System.out.println("\n*********************************");
		 if(a.length>b.length)
		 for(int i=0;i<b.length;i++)
		 {
		
			// System.out.print(" "+a[i]+" ");
			// System.out.print(" "+b[i]);
			 
			 if(a[i]==b[i])
			 {
				 set.add(i);
			 }
		//	 System.out.print(set); 
			// System.out.print(set.toString());
			 
		 }
		 else
			 for(int i=0;i<a.length;i++)
			 {
			
				// System.out.print(" "+a[i]+" ");
				// System.out.print(" "+b[i]);
				 
				 if(a[i]==b[i])
				 {
					 set.add(i);
				 }
			//	 System.out.print(set); 
			 }
		 System.out.print(set.toString());
		 
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		
		int arr[]= {2,6,1,9,4,18,59,48};
		int b[]= {0,6,3,2,4,9};
	//	Sorting(arr);
	//	int a[]=new int[] {1, 0, 1, 1, 0, 1, 0, 0};
	//	 sortBinaryArray(a);
		 
		 //	 intersection(arr,b);
		 
		 SortingbyOneloop( arr);
	}

}
