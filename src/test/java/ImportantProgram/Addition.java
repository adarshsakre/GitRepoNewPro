package ImportantProgram;

public class Addition
{
	public static void main(String[] args) 
	{
		String s="a1b3$%c4@17";
		int sum=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isDigit(s.charAt(i)))
			{
				sum=sum+s.charAt(i)-48;
				
			}
		}
		System.out.println(sum);
	}

}
