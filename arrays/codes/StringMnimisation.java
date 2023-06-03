import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMnimisation {

	
	public static String stringeqchar(String str)
	{
		String strL="";
		String strR="";
		int count=0;
		for(int i=0;i<str.length();i++)
		{	char c;
			
			c=str.charAt(i);
			if(c!=' ')
			{
				strR+=c;
				count++;
			}
			else
				break;
			
				
		}
	
		
		for(int i=count+1;i<str.length();i++)
		{
			char c=str.charAt(i);
				
				strL+=c;		
		}
		StringBuilder sr=new StringBuilder();
		String Astr=strL+strR;
	//	sr.append(Astr);
		String xyz=""; 
		int k=0;
		System.out.println();
		for(int i=0;i<Astr.length();i++)
		{
			
			if(Astr.charAt(count+1)==Astr.charAt(count+2))
			{
				i++;
				++i;
			}
			xyz+=Astr.charAt(i);
		}
			System.out.println(xyz);
		
	/*	while( k<Astr.length())
		{
			char x=Astr.charAt(k);
			
			if(Astr.charAt((Astr.length()/2))==(Astr.length()/2)+1)
			{
				sr.deleteCharAt((Astr.length()/2));
				sr.deleteCharAt((Astr.length()/2)+1);	
			}		
			k++;
		}
		*/
		String result=new String(sr);
		//System.out.println(sr);
		//System.out.println(sr.length());
		return result;
	}
	
	public static void vowels(String str,String s)
	{
		int countS=0;
		int countstr=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				countS++;
			}
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				countS++;
			}
		
		}
		System.out.println("Vowels in String "+s+" are: "+countS++);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				countstr++;
			}
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				countstr++;
			}
		
		}
		System.out.println("Vowels in String "+str+" are: "+countstr++);
	}
	
	public static void ReverseWithoutHash(String s)
	{
		String s1="";
		int j=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='#')
			{
				j=i;
				continue;
			}
			s1=s1+s.charAt(i);
		}
		s1=StringOperation.Reverse(s1);
		System.out.println(s1);
		String s2="";
		for(int i=1;i<s.length();i++)
		{
			if(i==j)
			{
				s2=s2+'#';
			}
			else if(i<j)
			s2=s2+s1.charAt(i);
			else
				s2=s2+s1.charAt(i-1);
		}
	//	System.out.println(s2);
	}
	public static void main(String[] args) {
			
		System.out.println("hiii please enter one string");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
	//	System.out.println(stringeqchar(str));
		System.out.println("*********************************");
	//	vowels("India","Austrailia");
	//	ReverseWithoutHash(str);
	}
//AABCCCABBA
}
