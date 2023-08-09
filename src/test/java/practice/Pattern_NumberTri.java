package practice;

public class Pattern_NumberTri 
{
	public static void main(String[] args)
	{
		
		int no=5;
		for (int i = 1; i<=no ; i++) 
		{
			for (int j = i; j <no; j++) 
			{
				System.out.print(" ");
				
			}
			int k=5;
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(k-- +" ");
				
			}
			System.out.println();
			
		}
		
		
//		int no=5;
//		int space=2;
//		int number=1;
//		for (int i = 1; i <=no; i++)
//		{
//			for (int j = 1; j <space; j++)
//			{
//				System.out.println(" ");
//			}
//			
//			for (int j = 1; j <number; j++) 
//			{
//				System.out.println(j);
//				
//			}
//			System.out.println();
//			
//		}
		
	}

}
