package practice;

public class Pattern_numberAssending 
{
	public static void main(String[] args) 
	{
		
		int no=5;
		for (int i = 1; i <=no; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		for (int i = 1; i <=no; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
