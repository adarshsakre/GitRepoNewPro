package practice;

public class Sum_of_1st_3_min_number
{
	public static void main(String[] args)
	{

		//sum of 1st 3 min number
		int[] arr= {5,3,4,1,2};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum =0;
		for (int j = 0; j < 3; j++) 
		{
			sum=sum+arr[j];
		}
		System.out.println("Sum of 1st 3 min number==>"+sum);
		
//------------------------------------------------------------------------
		//sum of 1st 3Max number
		int[] arr1= {5,3,4,1,2};
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if(arr1[i]>arr1[j])
				{
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		int sumM=0;
		for (int i = 0; i < 3; i++)
		{
			sumM=sumM+arr1[i];
		}
		System.out.println("Sum of 1st 3 max number====>"+sumM);
	}

}
