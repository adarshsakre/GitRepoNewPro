package Interview_Program;

public class ReverseAndSplit 
{
	public static void main(String[] args)
	{
		
		String a="i love programming";
		String[] sp = a.split(" ");
		for (int i = 0; i <= sp.length-1; i++)
		{
			String sp1 = sp[i];
			for (int j =sp1.length()-1; j >=0; j--) 
			{
				System.out.print(sp1.charAt(j));
			}
			
			System.out.print(" ");			
		}
		
	}

}
