package practice;

import java.util.LinkedHashSet;

public class RemoveD_NoOfDuplicatesCountInString 
{
	public static void main(String[] args)
	{

		String se="I am am am a a Software Engineer and and Automation Engineer";
		String [] arr=se.split(" ");
		int count=0;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
			for (int i = 0; i < arr.length; i++) 
			{
				if(!set.add(arr[i]))
				{
					count++;
				}
			}
			System.out.println(count);
		}
		




}
