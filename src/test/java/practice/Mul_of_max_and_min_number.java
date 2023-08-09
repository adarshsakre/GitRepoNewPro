package practice;

public class Mul_of_max_and_min_number
{
	public static void main(String[] args)
	{
		
		int[] arr= {5,3,4,1,2};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[i]>arr[j])
				{

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
			int mul=1;
			for (int j = 0; j < 3; j++) 
			{
				mul=mul*arr[j];
			}
			System.out.println("Mul of 1st 3 max number====>"+mul);
		
//--------------------------------------------------------------------	

			int[] arr1= {5,3,4,1,2};
			for (int i = 0; i < arr1.length; i++) 
			{
				for (int j = 0; j < arr1.length; j++) 
				{
					if (arr1[i]<arr1[j])
					{

						int temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
						
					}
					
				}
			}
				int mull=1;
				for (int j = 0; j < 3; j++) 
				{
					mull=mull*arr1[j];
				}
				System.out.println("Mul of 1st 3 min number====>"+mull);
			
		
	}

}
