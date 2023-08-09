package practice;


public class FindMaxLengthIndexFromStringArray 
{
	public static void main(String[] args) 
	{
		
		String[] s = {"ab","bcde","hbvjk","ec"};
		String max_len=s[0];
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()>max_len.length())
			{
				max_len=s[i];
			}
			
		}
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].length()==max_len.length())
			{
				System.out.println(s[i]+" ");
			}
			
		}
		
	}

}
