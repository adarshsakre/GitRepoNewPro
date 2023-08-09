package practice;

import java.util.LinkedHashSet;

public class PrintPositionOfCharacterWithOutDupilicates 
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
		for (Character ch : set) 
		{
			for (int i = 0; i < s.length(); i++) 
			{
				if (ch==s.charAt(i)) 
				{
					System.out.println(ch+" is present in "+(i+1)+" position");
					break;
				}
				
			}
			
			//to print in reverse and o/p should be s=3 t=4 e=5 r=6
//			for (int i = s.length()-1; i >=0; i--) 
//			{
//				if (ch==s.charAt(i)) 
//				{
//					System.out.println(ch+" reverse is present in "+(i+1)+" position");
//					break;
//				}
//				
//			}
		}
		
	}

}
