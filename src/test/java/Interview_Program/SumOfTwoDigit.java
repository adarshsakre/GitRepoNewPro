package Interview_Program;

public class SumOfTwoDigit 
{
	public static void main(String[] args) 
	{
		
		String s="a22s858d5d2fggf5dh525k1";
		int sum=0;
		int tsum=0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i)>'0'&&s.charAt(i)<'9')
			{
				int n=s.charAt(i)-48;
				tsum=tsum*10+n;
			}
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
			
		}
		
		sum=sum+tsum;
		System.out.println(sum);
		
		
	}

}
