package Interview_Program;

public class FirstWordCapital 
{
	public static void main(String[] args)
	{
		
		String s="welcome to tyss office";
		String[] arr = s.split(" ");
		String arr1="";
		String output = "";
		for (int i = 0; i < arr.length; i++)
		{
			 arr1 = arr[i];
			for (int j = 0; j < arr1.length(); j++) 
			{
				if (j==0)
				{
					output=output+(char)(arr1.charAt(j)-32);
					
				}
				else
				{
					output=output+arr1.charAt(j);
				}
				
			}
			output=output+" ";
			
		}
		System.out.println(output);
		
		
	}

}
