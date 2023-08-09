package Interview_Program;

public class firstsecondthirdmax 
{
	public static void main(String[] args)
	{
		

		int [] s= {8,-3,0,2,1,-9};
		int f=0;
		int se=0;
		int t=0;
		for (int i = 0; i < s.length; i++)
		{
			if (s[i]>f)
			{
				t=se;
				se=f;
				f=s[i];
			}
			else if (s[i]>se) 
			{
				t=se;
				se=s[i];
				
			}
			else if (s[i]>t) {
			t=s[i];
			}
			
			
		}
		System.out.println(f+" "+se+" "+t);
		
	}

}
