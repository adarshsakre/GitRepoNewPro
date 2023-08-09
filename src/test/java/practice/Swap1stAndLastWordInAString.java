package practice;

public class Swap1stAndLastWordInAString 
{
	public static void main(String[] args)
	{
		
		String st="I am a software Engineer";
		String[] s=st.split(" ");
		//Swaped 1st and last String
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for (int i = 0; i < s.length; i++) 
		{
			System.out.print(s[i]+" ");
		}
		
		
	}

}
