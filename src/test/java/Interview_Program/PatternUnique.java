package Interview_Program;

public class PatternUnique 
{
	public static void main(String[] args)
	{
		
		int n=6;
		for (int i = -n; i <=n; i++) 
		{
			for (int j = 1; j <= n; j++)
			{
				if (Math.abs(i)+Math.abs(j)<=n) 
				{
					if ((i+j)%2==0) 
					{
						System.out.print("* ");
						
					}
					else
					{
						System.out.print("  ");
						
					}
				}
				else 
				{
					System.out.print("  ");
					
				}
				
			}
			System.out.println();
		}
		
	}

}
