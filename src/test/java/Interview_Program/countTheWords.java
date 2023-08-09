package Interview_Program;

import org.testng.annotations.Test;

public class countTheWords
{
	
	public static void main(String[] args)
	{
		String a ="aaabbcdddf";
		int count=1;
		char value = a.charAt(0);
		String s="";
		for (int i = 1; i < a.length(); i++) 
		{
			char comp = a.charAt(i);
			if (comp==value) 
			{
				count++;
				
			}
			else
			{
				 s = s+value+count;
				 value=comp;
				 count=1;
			}
		}
		s = s+value+count;
		System.out.println(s);
	}

}
