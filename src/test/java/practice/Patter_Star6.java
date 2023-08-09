package practice;

public class Patter_Star6 
{
	public static void main(String[] args) 
	{
		
		int no=5;
		for (int i = 1; i <=no; i++) 
		{
			for (int j = 1; j < i; j++) 
			{
				System.out.print("  ");
			}
			
			for (int j = i; j <= no; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
	}

}
