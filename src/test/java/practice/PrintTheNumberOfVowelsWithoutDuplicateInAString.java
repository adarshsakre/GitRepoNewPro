package practice;

import java.util.LinkedHashSet;

public class PrintTheNumberOfVowelsWithoutDuplicateInAString
{
	public static void main(String[] args) 
	{

		String b="iiiibangloreeeeeu";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < b.length(); i++) 
		{
			set.add(b.charAt(i));
		}
		int count=0;
		for (Character ch : set) 
		{
			
			for (int i = 0; i < b.length(); i++) 
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
				{
					count++;
					System.out.print(ch+" ");
					break;
				}

			}
			

		}

		System.out.print(count);




	}

}
