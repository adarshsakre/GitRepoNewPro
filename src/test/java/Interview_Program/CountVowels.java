package Interview_Program;

public class CountVowels 
{
	public static void main(String[] args) 
	{
		
		String s="education";
		String vowel="aeiou";
		for (int i = 0; i < s.length(); i++)
		{
			if (vowel.contains(Character.toString(s.charAt(i)))) 
			{
				System.out.print(s.charAt(i));
				
			}
			
		}
	}

}
