package Interview_Program;

public class a2b2c2d2App2 
{
	public static void main(String[] args) {
		String str="a2b2c3d4";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length-1; i++)
		{
			if (Character.isDigit(arr[i+1]))
			{
				int count = arr[i+1]-48;
//				System.out.println(count);
				
				for (int j = 0; j < count; j++) 
				{
					System.out.print(arr[i]);
					
				}
				
			}
			
		}
	}

}
