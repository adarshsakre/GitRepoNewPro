package practice;

import java.util.Scanner;

public class Pattern_StraTriangle 
{
	public static void main(String[] args) 
	{
		
		
		int no=5;
		for (int i = 1; i < no; i++) 
		{
			for (int j = i; j <no; j++) //space
			{
				System.out.print("  ");
			}
			for (int j = 1; j <=i*2-1; j++) //star
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		for (int i = 1; i <= no; i++) 
		{
			for (int j = 1; j <i; j++) //space
			{
				System.out.print("  ");
			}
			for (int j = i; j <=no*2-i; j++) //star
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
//		int no=5;
		
		
		
	}

}
