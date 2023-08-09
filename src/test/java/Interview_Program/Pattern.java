package Interview_Program;

import java.util.Iterator;

public class Pattern 
{
	public static void main(String[] args) 
	{
		
		String a="Selenium";
		for (int i = 0; i < a.length(); i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(a.charAt(j));
				
			}
			System.out.print(" ");
			
		}
		
	}

}
