import java.util.HashSet;
import java.util.Set;

public class StringOperation {

	public static String Reverse(String str)
	{
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			s+=c;
	
		}
		System.out.println(s);
		return s;
	}
	  public static void Palendrom(String s) {
		  
		    String reverse="";
		    
		            for(int i=s.length()-1;i>=0;i--)
		            {
		                    char c=s.charAt(i);
		                    reverse+=c;
		            }
		           
		          
		             if(s.equals(reverse))
		             {
		                 System.out.println("String is palendrom ") ;
		             }
		             else{
		            	 System.out.println( "String is not palindrom");
		             }
		            
		            
		            }

	public static void uniqMaxsubstring(String s)
	{
		/*
		    int n = s.length();
		    Set<Character> visited = new HashSet<>();
		    int start = 0;
		    int maxLen = 0;
		    String maxSubstring = "";
		    
		    for (int i = 0; i < n;i++) {
		        while (visited.contains(s.charAt(i))) {
		            visited.remove(s.charAt(start));
		            start++;
		        }
		        visited.add(s.charAt(i));
		        int length = i - start + 1;
		        if (length > maxLen) {
		            maxLen = length;
		            maxSubstring = s.substring(start, i+1);
		            
		        }
		    }
		    
		    System.out.println(maxSubstring) ;
		
		*/
		
	/*	 Set<Character> visited = new HashSet<>();
		 int maxcount=0;
		 int i=0,j=0;
		 while(i<s.length() && j<s.length())
		 {
			 if(!visited.contains(s.charAt(j)))
			 {
				 visited.add(s.charAt(j));
				 maxcount=Math.max(maxcount, j-i+1);
				 j++;
			 }
			 else
			 {
				 visited.remove(s.charAt(i));
				 i++;
			 }
		 }
		 System.out.println(maxcount);
		 */
	}
	
	
	public static void main(String[] args) {
	
				Reverse("Amitabh");
				System.out.println("*********************************");
				Palendrom("nitin");
				System.out.println("*********************************");
				uniqMaxsubstring("abcdeabcbb");
				
	}

}
