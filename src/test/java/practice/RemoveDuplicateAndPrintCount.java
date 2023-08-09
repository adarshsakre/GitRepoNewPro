package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateAndPrintCount
{
	public static void main(String[] args) 
	{
		
		String st="Tester";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++)
		{
			set.add(s.charAt(i));
 			
		}
		System.out.println(set);
		
		for(Character ch :set)
		{
//			int c=0;
			int count=0;
			for (int i = 0; i < s.length(); i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
//				if(!ch.equals(s.charAt(i)))
//				{
//					c++;
//				}
				
			}
//			System.out.println(c+"c");
			System.out.println(ch+"  is repeating  "+count+" times");

			//To print unique
			if(count==1)
			{
				System.out.println(ch+"=="+count);
			}
//			
//			
//			//To print duplicates 
			if(count>1)
			{
				System.out.println(" Duplicate values==>> "+ch+" Repeating "+count);
			}
		}
		
	}

}
