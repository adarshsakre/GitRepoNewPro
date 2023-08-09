package practice;

public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		
		String st="I am a software Engineer";
		String[] s=st.split(" ");
		for (int i = s.length-1; i >=0; i--) 
		{
			System.out.print(s[i]+" ");
			
		}
		
		
	}

}
