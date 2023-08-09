package Interview_Program;

public class PrintSomeNumber 
{
	public static void main(String[] args) 
	{
		
		int arr[]= {2,3,9};
		for (int i = 0; i < 10; i++) 
		{
			boolean flag=true;
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[j]==i)
				{
					flag=false;
					
				}
			}
			if (flag)
			{
				System.out.println(i);
				
			}
			
		}
	}

}
