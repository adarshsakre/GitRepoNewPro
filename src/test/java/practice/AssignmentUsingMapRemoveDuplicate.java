package practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class AssignmentUsingMapRemoveDuplicate
{
	public static void main(String[] args)
	{
		
		String a="testyantra";
		//To remove duplicate
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) 
		{
			map.put(a.charAt(i), i);
		}
		System.out.println(map);
		 for (Entry<Character, Integer> m : map.entrySet())
		 {
			 int count=0;
			for (int i = 0; i < a.length(); i++)
			{
				if(m.getKey()==a.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(m.getKey()+" is repeating "+count+" times");
			}
			if(count>1)
			{
//				System.out.println(m.getKey()+" is repeating "+count+" times");
			}
		}
		
	}

}
