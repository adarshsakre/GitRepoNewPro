package Interview_Program;

public class Reverse_String4
{
	public static void main(String[] args) 
	{
		
		String a="today is friday";
		String[] pg = a.split(" ");
		for (int i = pg.length-1; i >= 0; i--)
		{
			System.out.print(pg[i]+" ");
			
		}
		
	}

}
