package Interview_Program;

public class Vowels
{
	public static void main(String[] args) 
	{
		
		String name="Rakshith chat zoom";
		String[] sp = name.split(" ");
		for (int i = 0; i < sp.length; i++) 
		{
			String value = sp[i];
			int count =0;
			for (int j = 0; j < value.length(); j++) 
			{
				if (value.charAt(j)=='a' || value.charAt(j)=='e' || value.charAt(j)=='i' || value.charAt(j)=='o' || value.charAt(j)=='u') 
				{
					count++;
				}
			}
			System.out.println(value+" "+count);
		}
		
	}

}
