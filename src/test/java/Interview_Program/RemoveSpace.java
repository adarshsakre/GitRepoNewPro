package Interview_Program;

public class RemoveSpace
{
	public static void main(String[] args) 
	{
		
		String s= "my name is radha";
		String[] rr = s.split(" ");
		for (String string : rr)
		{
			System.out.print(string);
		}
	}
}