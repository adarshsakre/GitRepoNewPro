package Interview_Program;

public class ReverseTheStringBasedOnIndex2 //approach 2
{
	public static void main(String[] args)
	{
		String a="i am selenium";
		String[] s = a.split(" ");
		String rev="";
		for (int i = s.length-1; i >=0; i--) 
		{
//			System.out.print(s[i]);
			String d=s[i];
		
			for (int j =d.length()-1; j >=0; j--) 
			{
				char ch = d.charAt(j);
				rev=rev+ch;
			}
			
		}
//		System.out.println(rev);	
		String arr="";
		int position=0;
		for (int i = 0; i < s.length; i++) 
		{
			arr=arr+rev.substring(position, position+s[i].length())+" ";
			position=position+s[i].length();
		}
		System.out.println(arr);
	}

}
