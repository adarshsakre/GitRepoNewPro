package Interview_Program;

import java.util.LinkedHashSet;

public class WithoutDuplicate21 
{
	public static void main(String[] args) 
	{
		
		String a="adarshsakreeee";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < a.length(); i++) 
		{
			set.add(a.charAt(i));
		}
		System.out.println(set);
	}
}
