package Interview_Program;

public class Malayalam
{
	public static void main(String[] args) 
	{
		
		String m="Malayalm";
		char[] arr = m.toLowerCase().toCharArray();
		boolean[] boo = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if (boo[i]==false)
			{
				int count=0;
				for (int j = 0; j < arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						count++;
						boo[j]=true;
						
					}
					
				}
				System.out.print(arr[i]+":"+count+" ");
			}
			
		}
	}

}
