package practice;

public class FindSumOfDigit 
{
	public static void main(String[] args) 
	{
		
		String s="a3b2d4";
		int sum=0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;//based on ASCII value
				sum=sum+n;
				
			}
			
			
		}
			System.out.println(sum);	
		
	}

}
