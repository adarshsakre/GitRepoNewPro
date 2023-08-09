package Interview_Program;

public class SimilarToFib
{
	public static void main(String[] args)
	{
		
		int a=1;
		int b=2;
		int c;
		for (int i = 0; i < 5; i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=c;
			b=c+1;
		}
		
		
		System.out.println();
		
		System.out.println("===========App2===============");
		
		int n=3;
		for (int i = 0; i < 5; i++)
		{
			System.out.print(n+" ");
			n=(n*2)+1;
			
		}
		
		
	}

}
