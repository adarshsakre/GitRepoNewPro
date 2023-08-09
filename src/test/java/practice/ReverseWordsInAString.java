package practice;

public class ReverseWordsInAString 
{
	public static void main(String[] args) 
	{

		String st="I am a software Engineer";
		String[] arr = st.split(" ");
		for (int i = 0; i < arr.length; i++)
		{
			String a=arr[i];
			for (int j = a.length()-1; j >=0; j--) 
			{
				System.out.print(a.charAt(j));
			}
			
			System.out.print(" ");

		}
	}

}
