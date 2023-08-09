package Interview_Program;

public class FirstMax8 
{
	public static void main(String[] args) 
	{
		
		int [] a= {7,-3,0,2,1,-9,8};
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if (max < a[i]) 
			{
				max=a[i];
			}
			else if (min > a[i]) 
			{
				min=a[i];
			}
			
		}
		System.out.println("First max number is "+max);
		System.out.println("Firts Min number is "+min);
	}

}
