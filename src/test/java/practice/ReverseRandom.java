package practice;

public class ReverseRandom
{
	public static void main(String[] args) 
	{
		
		String a="i am a software engineer";
		String[] s = a.split(" ");
		
		for (int i = s.length-1; i >=0; i--) 
		{
//			System.out.print(s[i]+" ");
			a=s[i];
			for (int j = a.length()-1; j >=0; j--) 
			{
				
				System.out.print(a.charAt(j)+"");
				
			}
			System.out.print(" ");
			
		}
		
		
	}

}
