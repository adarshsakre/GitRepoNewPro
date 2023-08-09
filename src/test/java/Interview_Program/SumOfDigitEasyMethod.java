package Interview_Program;

import java.util.Iterator;

public class SumOfDigitEasyMethod
{
	public static void main(String[] args)
	{
		
		String s="aa1dd4k4p6";
		String[] number = s.split("\\D+");
		int sum=0;
		for (String num : number)
		{
			if (!num.isEmpty())
			{
				int data = Integer.parseInt(num);
				sum=sum+data;
				
			}
			
		}
		System.out.println(sum);
	}

}
