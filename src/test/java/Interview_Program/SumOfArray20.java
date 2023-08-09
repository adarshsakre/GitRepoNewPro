package Interview_Program;

public class SumOfArray20 
{
	public static void main(String[] args)
	{
		
		int [] a= {7,-6,11,9,0,4};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i] < a[j]) 
				{
					int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
				
			}
			
		}
		int sum = 0;
		for (int i = 0; i < 3; i++) 
		{
			System.out.print(a[i]+" *");
			sum=sum+a[i];
			
		}
		System.out.println("= "+sum);
		
	}

}
