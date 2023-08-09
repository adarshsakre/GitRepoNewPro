package Interview_Program;

public class SwapTheString 
{

	public static void main(String[] args) 
	{
		String a="good";
		String b="morning";
		
		a=a+b;
		System.out.println(a);
		
	b=a.substring(0, (a.length()-b.length()));
	System.out.println(b);
	
	
	a=a.substring(b.length());
	System.out.println(a+" "+b);
	
	}
}
