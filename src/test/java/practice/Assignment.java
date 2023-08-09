package practice;

import java.util.LinkedHashSet;

public class Assignment
{
	public static void main(String[] args) 
	{
		
		int [] a= {5,3,1,1,4,5,6};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		System.out.println(set);
	
		for (Integer in : set)
		{
//			int count=0;
			for (int i = 0; i < a.length; i++) 
			{
				if(in==a[i])
				{
//					count++;
					System.out.println(in+" position "+i);
					break;
				}
				
				
			}
//			System.out.println(in+" is repeating "+count);
			
		}
		
	}
	

}
