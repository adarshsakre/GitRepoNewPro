package Interview_Program;

public class reverse_String_1
{
	public static void main(String[] args) 
	{
		
		String a= "welcome to expleo";
		String[] pg = a.split(" ");
		for (int i = pg.length-1; i >=0; i--) 
		{
			System.out.print(pg[i]+" ");
			
		}
	}

}
