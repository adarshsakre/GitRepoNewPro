package Interview_Program;

public class CountWords19 //not working
{
	public static void main(String[] args) 
	{
		
		String a="malyalam";
		int count=1;
		String s="";
		char pg = a.charAt(0);
		for (int i = 1; i < a.length(); i++) 
		{
			char data = a.charAt(i);
			if (data==pg)
			{
				count++;
				
			}
			else
			{
				s=s+pg+count;
				pg=data;
				count=1;
			}
		}
		
		s=s+pg+count;
		System.out.println(s);
	}

}
