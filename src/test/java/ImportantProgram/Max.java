package ImportantProgram;

public class Max 
{
	public static void main(String[] args) 
	{
		int [] s={1,2,3,4,4,5};
		int fmax=s[0];
		int smax=s[0];
		for(int i=0;i<s.length;i++)
		{
			if (s[i]>fmax)
			{
				
				smax=fmax;
				fmax=s[i];
			}
			else if (s[i]>smax) 
			{
				smax=s[i];
		}
		}
			System.out.println(smax);

	}

}
