package Interview_Program;

import java.util.HashMap;
import java.util.Map.Entry;

public class Accurance 
{
	public static void main(String[] args) 
	{
		
		String s="aabbaa";
		char[] arr = s.toCharArray();
		 
		boolean[] frr=new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			if (frr[i]==false) 
			{
				int count=0;
				for (int j = i; j < arr.length; j++)
				{
					if (arr[i]==arr[j]) 
					{
						count++;
						frr[j]=true;
						
					}
					
				}
				System.out.print(arr[i]+""+count);
			}
			
		}
		
		//==========================================================
		System.out.println();
		System.out.println("===========2nd apporach===============");
		String a="aabbaa";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for ( char ch : a.toCharArray()) 
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(map);
		//if i want output in String
		for (Entry<Character, Integer> data : map.entrySet()) 
		{
			System.out.print(data.getKey()+""+data.getValue()+" ");
			
		}
		
	}
	
	

}
