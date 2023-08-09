package Interview_Program;

public class ProductOfNumberEasyMethod
{
	public static void main(String[] args)
	{
		
		String s="aa1dd4k4p2";
		String[] number = s.split("\\D+");
		int sum=1;
		for (String num : number) 
		{
			if (!num.isEmpty())
			{
				int product = Integer.parseInt(num);
				sum=sum*product;
				
			}
			
		}
		System.out.println(sum);
		
	}

}
