package Interview_Program;

public class PatternImp2
{
	public static void main(String[] args) 
	{
		String s="India";
		int n = s.length();
		
		 
		for (int i = 0; i < n; i++)
		{
			int a=0;
			for (int j = 0; j < n; j++)
			{
				if ((i+j)>=n-1) 
				{
					System.out.print(s.charAt(a)+" ");
					a++;
//					System.out.print(s.charAt(s.length()-1-j)+" ");
					
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
