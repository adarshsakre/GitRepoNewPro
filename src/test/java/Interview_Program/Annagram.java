package Interview_Program;

import java.util.ArrayList;
import java.util.Collections;

public class Annagram 
{
	public static void main(String[] args) 
	{
	
	String s="race";
	String s1="care";
	 
	ArrayList<Character> arr = new ArrayList<Character>();
	ArrayList<Character> arr1 = new ArrayList<Character>();
	for (Character character : arr) 
	{
		arr.add(character);
		
	}
	for (Character character : arr1)
	{
		arr1.add(character);
		
	}  
	Collections.sort(arr);
	Collections.sort(arr1);
	
	System.out.println(arr.equals(arr1));
	}
}
