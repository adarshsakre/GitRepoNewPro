package Interview_Program;

import java.util.LinkedHashSet;

public class Remove_duplicates_From_String 
{
	public static void main(String[] args) 
	{
		String a= "adarshsakrebengalurushahabad";
		LinkedHashSet<Character> data = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) 
		{
			data.add(a.charAt(i));
			
		}
		System.out.println(data);
		
		
	}

}
