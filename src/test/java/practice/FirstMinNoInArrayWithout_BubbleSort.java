package practice;

public class FirstMinNoInArrayWithout_BubbleSort 
{
	public static void main(String[] args)
	{
		
		int [] arr= {5,3,4,1,2};
		int min=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (min>arr[i]) 
			{
				min=arr[i];
			}
			
		}
		System.out.println("1st min no in array >>>>"+min);
	}

}
