package Pract;

public class newd
{
	public static void main(String[] args) 
	{

		String s="india";
		int space=4;
		int star=1;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" ");
				
			}
			for (int j = 1; j <= star; j++) 
			{
				System.out.print(s.charAt(i));
				
			}
			System.out.println();
			space--;
			star++;
			
			
		}
	} 

}
