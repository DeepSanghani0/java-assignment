package Module_2;
//• Write a Java program to get the number of elements in a hash set.
import java.util.HashSet;

public class hasset_numberofelements 
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
		
		int n = alpha2.size();
		System.out.println("Number of elements in alpha2 is: "+n);
	}
}
