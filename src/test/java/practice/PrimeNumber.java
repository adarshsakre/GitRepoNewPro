package practice;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
		for (int i = 1; i < 10; i++) 
		{
//			int Numb=i;
			int count=0;
			for (int j = 1; j <=i; j++) 
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i+" It is a Prime Number");
			}
			else
			{
				System.out.println(i+" It is not a prime number");
			}
		}
		
	}

}
