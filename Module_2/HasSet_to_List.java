package Module_2;
//Write a Java program to convert a hash set to a List/Array List.
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HasSet_to_List 
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
		
		ArrayList<String>ls = new ArrayList<String>(hs);
		System.out.println(ls);
	}
}
