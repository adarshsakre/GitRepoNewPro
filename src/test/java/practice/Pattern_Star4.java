package practice;

public class Pattern_Star4 
{
	public static void main(String[] args) 
	{
		
//		int no=5;
//		int space=4;
//		int star=1;
//		for (int i = 1; i <=no; i++) 
//		{
//			for (int j = 1; j <= space; j++) 
//			{
//				System.out.print(" ");
//			}
//			
//			for (int j = 1; j <= star; j++)
//			{
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			space--;
//			star++;
//			
		
		int no=5;
		for (int i = 1; i <=no; i++) 
		{
			for (int j = i; j < no; j++) 
			{
				System.out.print("  ");
			}
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			
		}
		
	}

}
