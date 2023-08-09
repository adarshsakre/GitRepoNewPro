package Interview_Program;

public class PalindromeNumber 
{

	public static void main(String[] args) 
	{
		int no=1221;
		int copy=no;
		int sum=0;
		while (no!=0)
		{
			int rem=no%10;
			sum=(sum*10)+rem;
			no=no/10;
		}
		
		if (copy==sum) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a palindrome");
			
		}
		
	}
}
