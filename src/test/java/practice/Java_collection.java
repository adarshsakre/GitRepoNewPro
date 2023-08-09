package practice;

import java.util.HashMap;
import java.util.Hashtable;

public class Java_collection 
{
	public static void main(String[] args) 
	{
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(10, "hi");
//		map.put(90, "hi");
//		map.put(30, "Hello");
//		map.put(10, "50");
//		map.put(null, "hi");
//		map.put(60, null);
//		
//		System.out.println(map);

		Hashtable<Integer, String> map = new Hashtable<Integer,String>();
		map.put(10, "hi");
		map.put(90, "hi");
		map.put(30, "Hello");
		map.put(10, "50");
		map.put(null, "hi");
		map.put(60, null);
		map.put(5, null+"  "+null);
		map.put(1, " ");
		map.put(2 ," h" );
		System.out.println(map);
		
	}

}
