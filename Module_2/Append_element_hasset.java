package Module_2;
// Write a Java program to append the specified element to the end of a hash set.
import java.util.HashSet;

public class Append_element_hasset 
{
	public static void main(String[] args) 
	{
		HashSet<String>alpha2 = new HashSet<String>();
		alpha2.add("A");
		alpha2.add("B");
		alpha2.add("C");
		alpha2.add("D");
		alpha2.add("E");
		System.out.println(alpha2);
		alpha2.add("F");
		System.out.println(alpha2);
		int n = alpha2.size();
		System.out.println(n);
	}
}
