package practice;

import java.util.Scanner;

public class Pattern_startriReverse 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		int no = sc.nextInt();
//		int no=5;
		for (int i = 1; i <no; i++) 
		{
			for (int j =i; j <no; j++) 
			{
				System.out.print(" ");
				
			}
			for (int j = 1; j <=i*2-1; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= no; i++) 
		{
			for (int j = 1; j <i; j++)
			{
				System.out.print(" ");
			}
			for (int j = i; j <=no*2-i; j++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		sc.close();
		
	}

}
