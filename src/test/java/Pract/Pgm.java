package Pract;

public class Pgm
{
	public static void main(String[] args) 
	{
		
		String [] a= {"Ram","ORiitu","Minku","Pinku"};
		for (int i = 0; i < a.length; i++)
		{
			String b=a[i];
			 b= b.toLowerCase();
			int count=0;
			String z="";
			for (int j = 0; j < b.length(); j++) 
			{
				if (b.charAt(j)=='a' || b.charAt(j)=='e' || b.charAt(j)=='i' || b.charAt(j)=='o' || b.charAt(j)=='u') 
				{
					
					count++;
					z=z+b.charAt(j);
				}
			}
			System.out.println(b+" = "+count+" vowels are  "+z);
			
		}
		
	}

}
