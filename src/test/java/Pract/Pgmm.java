package Pract;

public class Pgmm 
{
	public static void main(String[] args)
	{
		
		String m="m10a111";
		int sum=0;
		for (int i = 0; i < m.length(); i++)
		{
			if (m.charAt(i)>='0' && m.charAt(i)<='9') 
			{
				int n=m.charAt(i)-48;
				sum=sum+n;
			}
			
		}
		System.out.println(sum);
		
	}

}
