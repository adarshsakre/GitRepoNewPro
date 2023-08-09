package practice;

public class ReverseAString 
{
	public static void main(String[] args) {
		String a="TestYantra";
		for (int i = a.length()-1; i >=0; i--) 
		{
			System.out.print(a.charAt(i));
		}
//		System.out.println();
		/**
		
		//2
		String b="Qspiders";
		char [] ba=b.toCharArray();
		for (int i = b.length()-1; i >=0; i--) 
		{
			
			System.out.print(ba[i]);
		}
		
		
		//3
		String c="Bengaluru";
		String rev="";
		for (int i = c.length(); i >= 0; i--) 
		{
			rev=rev+c.charAt(i);
		}
		System.out.print(rev);
		
		
		//4
		String d="Jspiders";
		char[] dd=d.toCharArray();
		int count=0;
		for(char x : dd)
		{
			count++;
		}
		for (int i = count-1; i >=0; i--)
		{
			System.out.println(dd[i]);
		}
		
		**/
		//5
//		StringBuilder h = new StringBuilder("Kalaburagi");
//		System.out.println(h.reverse());
}

}
