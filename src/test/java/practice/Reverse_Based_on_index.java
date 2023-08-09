package practice;

public class Reverse_Based_on_index
{
	
	public static void main(String[] args) 
	{
		String a="My name is Adarsh";
		String[] s = a.split(" ");
		int[] j = new int[s.length];
		for (int i = 0; i < s.length; i++) 
		{
			j[i]=s[i].length();
		}
		String R="";
		for (int i = 0; i < s.length; i++)
		{
			R=R+s[i];
			
		}
		String rev="";
		for (int i = R.length()-1; i >=0; i--) 
					rev=rev+R.charAt(i);
		
			System.out.println(rev);
			System.out.println(a);
		int num=0;
			for (int k = 0; k < j.length; k++) 
			{
				for (int i = 0; i < j[i]; i++)
				{
					System.out.println(rev.charAt(num));
					num++;
					
				}
				System.out.print(" ");
				
				
			}
		
		
		
	}

}
