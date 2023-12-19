package Module_2;
//Write a Java program to count the number of key-value (size) mappings in a map.
import java.util.HashMap;

public class Map_Size 
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
		System.out.println("Number of Key-Value is: "+hm.size());
	}
}