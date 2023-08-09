package Interview_Program;

public class Accurance2 
{
	public static void main(String[] args) 
	{
		
		String a="my name is adarsh sakre name is my adarsh";
		String[] s = a.split(" ");
		boolean[] f = new boolean[s.length];
		for (int i = 0; i < s.length; i++) 
		{
			if (f[i]==false) 
			{
				int count=0;
				for (int j = 0; j < s.length; j++)
				{
					if (s[i].equals(s[j]))
					{
						count++;
						f[j]=true;
						
					}
					
				}
				System.out.println(s[i]+""+count);
			}
			
		}
	}

}
