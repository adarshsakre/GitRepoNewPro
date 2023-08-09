package Interview_Program;

public class Remove_duplicates2
{
	public static void main(String[] args)
	{
		
		String a="i i am am adarsh adarsh sakre sakre";
		String[] pg = a.split(" ");
		for (int i = 0; i < pg.length-1; i++) 
		{
			for (int j = i+1; j < pg.length-1; j++) 
			{
				if (pg[i].equals(pg[j])) 
				{
					pg[i]="duplicates";
					
				}
				
			}
			
		}
		for (int i = 0; i < pg.length-1; i++) 
		{
			if (pg[i]!="duplicates") 
			{
				System.out.print(pg[i]+" ");
				
			}
			
		}
	}

}
