package Interview_Program;

import java.util.Scanner;

public class Palindrom 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String m=sc.next();
		String rev="";
		for (int i = m.length()-1; i >= 0; i--) 
		{
			rev = rev+m.charAt(i);
			
		}
		
		if (m.equals(rev)) 
		{
			System.out.println("It is a palindrome");
			
		}
		else
		{
			System.out.println("It is not a palidrome");
		}
		
	}

}
