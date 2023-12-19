package Module_2;
//Write a Java program to get a collection view of the values contained in this map.
import java.util.HashMap;

public class map_comtain_values 
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
		System.out.println(hm.values());
	}
}
