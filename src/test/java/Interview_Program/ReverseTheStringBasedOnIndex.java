package Interview_Program;

import java.util.Iterator;

public class ReverseTheStringBasedOnIndex //approach 1
{
	public static void main(String[] args) 
	{
		
		String str="i am adarsh sakre";
		char[] s1 = str.toCharArray();
		String s2="";
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (c!=' ')
			{
				s2=c+s2; //reverse the string
				
			}
		}
		System.out.println(s2);
		char[] s3 = s2.toCharArray();
		int k=0;
		for (int i = 0; i < s1.length; i++) 
		{
			if (s1[i]!= ' ')
			{
				s1[i]=s3[k];
				k++;
				
			}
			
		}
		String s4 = new String(s1);
		System.out.println(s4);
	}

}
