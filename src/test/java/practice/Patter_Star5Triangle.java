package practice;

public class Patter_Star5Triangle
{
	public static void main(String[] args)
	{
		
//		int no=5;
//		int space=2;
//		int star=1;
//		for (int i = 0; i < no; i++) 
//		{
//			for (int j = 1; j <= space; j++) 
//			{
//				System.out.print(" ");
//			}
//			for (int j = 1; j <=star; j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			space--;
//			star=star+2;
//			
//		}
		
		
		
		
		int no=5;
		for (int i = 1; i <=no; i++) 
		{
			for (int j = i; j <=no; j++) 
			{
				System.out.print(" ");
				
			}
			for (int j = 1; j <=i*2-1; j++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	
		
	}

}
