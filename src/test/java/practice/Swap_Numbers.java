package practice;


public class Swap_Numbers
{
	public static void main(String[] args) 
	{
		
		//swap 2 numbers using 3rd variable
		int a=10;
		int b=40;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+" "+"b="+b);
		
				
		//swap 2 numbers without using 3rd variable
		int d=20;
		int e=40;
		d=d+e;
		e=d-e;
		d=d-e;
		System.out.println("d="+d+" "+"e="+e);
		
		
		
	}

}
