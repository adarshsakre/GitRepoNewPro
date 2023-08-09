package practice;

public class SThirdMin 
{
	public static void main(String[] args) 
	{
		
		int [] arr= {5,3,4,1,2,6};
		int fmin=arr[0];
		int smin=arr[0];
		int tmin=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (fmin>arr[i])
			{
				tmin=smin;
				smin=fmin;
				fmin=arr[i];
			}
			else if(tmin>arr[i])
			{
				tmin=smin;
				smin=arr[i];
			}
		}
		System.out.println("First min number is>>>>"+fmin);
		System.out.println("Second min number is>>>>"+smin);
		System.out.println("Third min number is>>>>"+tmin);
		
		//-
		
	}

}
