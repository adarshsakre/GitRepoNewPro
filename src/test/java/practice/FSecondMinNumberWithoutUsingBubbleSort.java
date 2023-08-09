package practice;

public class FSecondMinNumberWithoutUsingBubbleSort
{
	public static void main(String[] args) 
	{
		
		int [] ar= {0,5,3,4,1,2};
		int f1min=ar[0];
		int s1min=ar[1];
		for (int i = 0; i < ar.length; i++) //0<6, 1<6  2<6
		{
			if (f1min>ar[i])//0>0  0>5 0>3
			{
				f1min=ar[i];
			}
			else if(s1min>ar[i])//5>0 5>5 5>3 3>4 3>1 1>2
			{
				if(ar[i]!=f1min) //0!=0  5!=0 3!=0 1!=0
				{
				s1min=ar[i];//5 3 1
				}
			}
		}
		System.out.println("Firt1 min number is>>>>"+f1min);
		System.out.println("Second1 min number is>>>>"+s1min);
		
	}

}
