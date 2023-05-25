import java.util.ArrayList;
import java.util.List;

public class NumOperation {
	
	public static void PairSum(int arr[],int n)
	{	int count=0;
	/*int low=0;
	int high=arr.length-1;
	while(low<high)
	{
		
		if(arr[low]+arr[high]>n)
		{
			high--;
		}
		else if(arr[low]+arr[high]<n)
		{
			low++;
		}
		else if(arr[low]+arr[high]==n)
		{
			low++;
			high--;
			count++;
		}
		
	}*/
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=arr[i];
		for(int j=0;j<arr.length;j++)
		{
			if(sum==n)
			{
			count++;
			}
			if(sum>n)
			{
				break;
			}
			if(j<arr.length)
			{
				sum=sum+arr[j];
			}
		}
	}
	if(count>0)
	System.out.println(count);
	else
	System.out.println(-1);
}
	public static void freqofNo(int arr[])
	{
	//	boolean flag=true;
		
		int freq[]=new int[arr.length];
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					freq[j]=visited;
				}
				
				if(freq[i]!=visited)
				{
					freq[i]=count;
				}
				
				
			}
		}
		
			for(int i=0;i<freq.length;i++)
			{	
				if(freq[i]!=visited)
				{
					
			System.out.println("Element: "+" |   "+" Frequency");
			System.out.println("      "+arr[i]+"     "+freq[i]+" ");
			System.out.println("**************************");
			
				}
			}
		
	}
	
	public static void ArrayPalendrom(int a[])
	{
		String reverse="";
		String str="";
		for(int i=0;i<a.length;i++)
		{
			str+=a[i]%2;		}
		for (int i=a.length-1;i>=0;i--)
		{
			reverse+=a[i]%2;
		}
		System.out.println(str+"   "+reverse);
		if(reverse.equals(str))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static void secMax(int arr[])
	{
		int max=0;
		int secmax=0;
		for(int i=0; i<arr.length; i++)
		{
            if(arr[i]>max )
            {
                secmax = max;
                max=arr[i];
            }
            else if(arr[i]>secmax)
            {
                secmax=arr[i];
            }
		}
        System.out.println("1st H value: " + max);
        System.out.println("2nd H Value: " + secmax);
	}
	public static void main(String[] args) {
	//	int arr[]= {1,2,3,4,5,6,7};
	//	PairSum(arr,15);
		int a[]= {2,77,6,2,1,2,4,10,2,9,2,6};
	//	freqofNo(a);
		int arr[]= {3,2,1,0,1,2,3};
	//	ArrayPalendrom(arr);
		int x[]= {8,4,5,3,2,6,9,1};
	//	 MaxMulMinAdd( x);
		//swap(94,56);
	//	secMax(a);
	//	int s=AreaOfTank(x);
		//System.out.println(s);
		
		 midmax(a);
		 OddEven(a);
	}
	public static void MaxMulMinAdd(int arr[])
	{
		List <Integer> list=new ArrayList<>();
		
		for (int i=0;i<arr.length;i++)
		{
			int sumS=0;
			int sumL=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
				sumS=sumS+arr[j];
				
				}
				else
					sumL=sumL+arr[j];
			
			}
			
				arr[i]=Math.abs(sumS*sumL);
		}
		System.out.print("Expected OutPut: 4+5+3+2+6+1=21*9=189");
		System.out.print("\nYour Input: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
	
	
	public static void swap(int a,int b)
	{
		System.out.println("Beforeb swapping : "+a+" "+ b);
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping : "+a+" "+ b);
		
	}
	
	public static int AreaOfTank(int arr[])
	{
		int area=0;
		int maxarea=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				//area=arr[i]*(j-i);
				
				int inddiff=j-i;
				int maxind=0;
				if(inddiff>maxind)
				{
					maxind=inddiff;
				}
				int max=0;
				if(max<arr[i])
				{
					max=arr[i];
				}
				
			System.out.println(max);
				
				maxarea=max*maxind;
				
				if(area>maxarea)
					maxarea=area;
			}
			
		}
		return maxarea;
	}
		
	public static int midmax(int arr[])
	{
		int max=0;
		int count;
		int secmax=0;
		for(int i=0;i<arr.length;i++)
		{	count=0;
		
			//for(int j=i;count<3;j++)
			{
				//count++;
					if(i%3==1)
					{
						if(arr[i]>max)
						{
						secmax=max;
							max=arr[i];
						}
						else if(arr[i]>secmax)
						{
							secmax=arr[i];
						}
					}
				
			}
		}
		System.out.println(secmax);
		return secmax;
	}
	
	
	public static void OddEven(int a[])
	{
		List <Integer> odd=new ArrayList<>();
		List <Integer> even=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				odd.add(a[i]);
			}
			else
			{
				even.add(a[i]);
			}
		}
		odd.toArray();
	System.out.println(odd.toString());
	System.out.println(even.toString());
	}
}
