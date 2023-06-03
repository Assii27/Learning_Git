import java.util.Scanner;

public class ReverseNo {

	public static void  reverseno(int no)
	{
		int sum=0;
		int res=0;
		while(no!=0)
		{
		res=no%10;
		sum=(sum*10)+res;
		no=no/10;
		}
		System.out.println(sum);
	}
	
	public static void ArrayNosum(int n)
	{
		Scanner sc=new Scanner(System.in);
	
		int sum=0;
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
			 
			 sum+=arr[i];
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("hiii please enter one Number");
		Scanner sc=new Scanner(System.in);
		
		int no=sc.nextInt();
		
	//	 reverseno(no);
		 ArrayNosum(no);
	}

}
