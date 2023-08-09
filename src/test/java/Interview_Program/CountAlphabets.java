package Interview_Program;

public class CountAlphabets
{
	public static void main(String[] args) 
	{
		
		String s="immunuties";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (s.charAt(i)=='u')
			{
				count++;
				
			}
			
		}
		System.out.println(count);
		
	}

}
