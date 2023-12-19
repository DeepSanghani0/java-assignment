package Module_2;
//Write a Java program to check whether a map contains key-value mappings (empty) or not
import java.util.HashMap;

public class Map_emptyornot 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Parth");
		hm.put(2, "Jay");
		hm.put(3, "Parth");
		hm.put(4, "Parth");
		hm.put(5, "Harsh");
		
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		
	}
}