package Interview_Program;

public class Reverse_aString 
{
	public static void main(String[] args) 
	{

		String input = "abc123abc123";
		String output = reverseDigits(input);
		System.out.println(output);
	}
	

	public static String reverseDigits(String input) {
		StringBuilder result = new StringBuilder();
		StringBuilder digits = new StringBuilder();

		for (int i = 0; i < input.length(); i++) 
		{
			char c = input.charAt(i);
			if (Character.isDigit(c)) 
			{
				digits.append(c);
			} 
			else
			{
				// Reverse the digits and append to the result
				result.append(digits.reverse());
				digits.setLength(0); // Clear the temporary digits string
				result.append(c);
			}
		}

		// Append any remaining digits at the end
		result.append(digits.reverse());

		return result.toString();
	}



}