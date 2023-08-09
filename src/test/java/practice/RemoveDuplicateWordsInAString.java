 package practice;
public class RemoveDuplicateWordsInAString 
{
	public static void main(String[] args) 
	{
		String se="I am am a a Software Engineer and Automation Engineer";
		String [] arr=se.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i].equals(arr[j]))
				{
					arr[i]="..";
				}
			}
			
		} 
		for (int j = 0; j < arr.length; j++) 
		{
			if (arr[j]!="..") 
			{
				System.out.print(arr[j]+" ");
				
			}
		}
		
		
	}

}
