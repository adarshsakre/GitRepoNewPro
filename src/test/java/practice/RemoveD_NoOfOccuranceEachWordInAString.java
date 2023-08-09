package practice;

import java.util.LinkedHashSet;

public class RemoveD_NoOfOccuranceEachWordInAString 
{
	public static void main(String[] args)
	{
		
		String se="I am am a a Software Engineer and and Automation Engineer";
		String[] arr=se.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) 
		{
			set.add(arr[i]);
		}
		
		System.out.println(set);
		for (String string : set) 
		{
			int count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if(string.equals(arr[j]))
				{
					System.out.println(string+" "+j);
					count++;
				}
				
			}
			if(count>1)System.out.println(string);
			
			if(count==1)
			{
				System.out.println(string);
			}
			
		}
		
		
		
	}

}
