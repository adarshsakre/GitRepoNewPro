package practice;

public class PrintPositionOfWordWithDuplicate 
{
	public static void main(String[] args) 
	{
		
		//not working
		String se="I am am a a Software Engineer and and Automation Engineer";
		String[] ch = se.split(" ");
		for (int i = 0; i < ch.length; i++) 
		{
			System.out.println(ch[i]+" "+i);
			
		}
		
	}

}
