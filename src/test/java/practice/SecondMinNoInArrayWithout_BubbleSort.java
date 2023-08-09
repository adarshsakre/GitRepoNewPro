package practice;

public class SecondMinNoInArrayWithout_BubbleSort 
{
	public static void main(String[] args) 
	{
		
		int [] arr= {5,3,4,1,2,-2,-1};
		int fmin=arr[0];
		int smin=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (fmin>arr[i])
			{
				smin=fmin;
				fmin=arr[i];
			}
			else if(smin>arr[i])
			{
				smin=arr[i];
			}
		}
		System.out.println("First min number is>>>>"+fmin);
		System.out.println("Second min number is>>>>"+smin);
		
		//--------------------------------------------------------
		
	}

}
