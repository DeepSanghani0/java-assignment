package Module_2;
//Write a Java program to convert a hash set to an array.
import java.util.HashSet;

public class Hasset_to_Array 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println(hs);
		String[] array = new String[hs.size()];
		hs.toArray(array);
		System.out.println("array: ");
		for(String s : array)
		{
			System.out.print(s+",");
		}
	}
}
