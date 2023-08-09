package practice;

public class PrintTheNumberOfVowelsInAString 
{
	public static void main(String[] args)
	{
		
		String b="i banglore";
		char[] s = b.toCharArray();
		int count=0;
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u')
			{
				count++;
				System.out.print(s[i]+" ");
			}
			
		}
		System.out.println("="+count);
	}

}
