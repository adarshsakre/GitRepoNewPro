package practice;

public class PrintPositionOfCharacterWithDupilicates 
{
	public static void main(String[] args)
	{
		
		String st="Tester";
		String s=st.toLowerCase();
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i)+" is present "+i+" position"); //Starts with 0
//			System.out.println(s.charAt(i)+" is present "+(i+1)+" position"); //Starts with 1
			
		}
		
	}

}
