package Interview_Program;

public class PatternAplabets 
{
	public static void main(String[] args)
	{
		
		String a="ABCDE";
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print(a.charAt(j)+" ");
				
			}
			System.out.println();
		}
		
	}

}
