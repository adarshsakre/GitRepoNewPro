package practice;

import java.util.LinkedHashSet;

public class UniquCharRemoveDuplicate
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
		
		//or 
		
//		String st1="Tester";
//		String st=st1.toLowerCase();
//		char[] s=st.toCharArray();
//		HashSet<Character> set = new HashSet<Character>();
//		for (Character chars:s)
//		{
//			
//			set.add(chars);
//			
//		}
//		System.out.println(set);
//		
	}

}
