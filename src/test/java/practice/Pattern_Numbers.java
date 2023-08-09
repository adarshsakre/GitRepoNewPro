package practice;

public class Pattern_Numbers 
{
	public static void main(String[] args) 
	{
		//same number in a row
		int no=5;
		for (int i = 1; i <=no; i++) 
		{
			for (int j = 1; j <=no; j++) 
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		//series order in row
		for (int i = 1; i <=no; i++) 
		{
			for (int j = 1; j <=no; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
