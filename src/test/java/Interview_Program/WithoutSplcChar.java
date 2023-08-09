package Interview_Program;

import java.util.LinkedHashSet;

public class WithoutSplcChar//not workinhg
{
	public static void main(String[] args)
	{
		String a="add@arr#ss?h";
		StringBuffer str = new StringBuffer(a);
		for (int j = 0; j < str.length(); j++) 
		{
			if(!Character.isLetterOrDigit(str.charAt(j))) 
			{
				str.deleteCharAt(j);
				str.deleteCharAt(j-1);
			}
		}	
		System.out.println(str);
	}
}
