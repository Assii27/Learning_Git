import java.util.LinkedList;
import java.util.List;

import org.hibernate.internal.build.AllowSysOut;

public class ReverseLinkedlist {

	public static void reverselinklist()
	{
		List <Integer> list=new LinkedList<>(); 
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int i=0;
		
//			for(int j=list.size()-1;j>=0;j--)
//			{
////				list.add(list.get(j));
//				list.set(i, list.get(j));
//				i++;
////			System.out.println(list.get(j));
//								
//			}
		
		int s=list.size();
		for(i=0;i<s/2;i++)
		{
			int temp=list.get(i);
			list.set(i, list.get(s-i-1));
			list.set(s-i-1, temp);
		}
			
			for(i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
	}
	public static void main(String[] args) {
		reverselinklist();

	}

}
