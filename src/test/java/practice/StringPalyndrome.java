package practice;

import java.util.Scanner;

public class StringPalyndrome 
{
	public static void main(String[] args)
	{
		for(;;) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev="";
		for (int i = s.length()-1; i >=0; i--) 
		{
			rev=rev+s.charAt(i);
			
		}
		if (rev.equals(s))
		{
			System.out.println("It is a Palyndrome");
			
		}
		else {
			System.out.println("It is not a Palyndrome");
		}
		}
	}

}
