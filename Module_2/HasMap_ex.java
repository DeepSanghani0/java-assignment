package Module_2;

import java.util.HashMap;

//Write a Java program to associate the specified value with the specified key in a Hash Map.
public class HasMap_ex 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "E");
		
		System.out.println(hm);
	}
}
