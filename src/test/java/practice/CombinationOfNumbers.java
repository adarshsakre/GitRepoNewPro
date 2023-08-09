package practice;

public class CombinationOfNumbers 
{
	public static void main(String[] args)
	{
		
		int [] a= {1,3,8,2,9,4,0};
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				int add=a[i]+a[j];
				if(add==11)
				{
					System.out.println(a[i]+" + "+a[j]+" = "+add);
				}
						
				
			}
		}
		
	}
}
