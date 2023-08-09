package Interview_Program;

public class PatternImp 
{
	public static void main(String[] args)
	{
		
		String s="India";
		int n = s.length();
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if ((i+j)>=n-1) 
				{
//					System.out.print(s.charAt(j)+" ");
					System.out.print(s.charAt(s.length()-1-j)+" "); //5-1-5=1
																	//5-1-4=2
					
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
