package Interview_Program;

public class ProductOf3No9 
{
	public static void main(String[] args) 
	{
		
		int [] a= {2,1,3,5,4};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
				}
				
			}
			
		}
		int mul = 1;
		for (int i = 0; i < 3; i++) 
		{
			System.out.print(a[i]+" * ");
			mul = mul*a[i];
			
		}
		System.out.println(" = "+mul);
	}

}
