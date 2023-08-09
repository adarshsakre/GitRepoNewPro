package Interview_Program;
public class ReverseTheStringBasedOnIndex3 //apprach 3  this one best to use
{
	public static void main(String[] args)
	{
		String a="i am selenium";
		System.out.println(a);
		String[] s = a.split(" ");
		StringBuilder build = new StringBuilder();
//		System.out.println(build);
		for (int i = 0; i < s.length; i++) 
		{
			build.append(s[i]);
		}
		build.reverse();
//		System.out.println(build);
		
		String rev="";
		int position=0;
		
		for (int i = 0; i < s.length; i++)
		{
			rev=rev+build.substring(position, position+s[i].length())+" ";
			position=position+s[i].length();
		}
		System.out.println(rev);


	}


}
