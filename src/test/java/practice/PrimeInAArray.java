package practice;

public class PrimeInAArray 
{
	//not working
	public static void main(String[] args) 
	{

		
		int [] a= {3,4,5,2,8,6};
		for (int i = 0; i < a.length; i++) 
		{

			int count=0;
			for (int j = 1; j <=a[i] ; j++) 
			{
				if(a[i]%j==0)
				{
					count++;

				}

			}
			if(count==2)
			{
				System.out.println(a[i]+" Prime");
			}
			else
			{
				System.out.println(a[i]+" Not a prime");

			}
		}
	}

}
