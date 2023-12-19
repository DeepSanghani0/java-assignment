package Module_2;
//• Write a Java program to iterate through all elements in a hash list.
import java.util.HashSet;
import java.util.Iterator;

public class HasSet_Iterate 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		System.out.println(hs);
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
