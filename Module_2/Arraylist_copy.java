package Module_2;
//• Write a Java program to copy one array list into another.
import java.util.ArrayList;
import java.util.List;

public class Arraylist_copy 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>alpha = new ArrayList<String>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");

		
		System.out.println("Alpha1"+alpha);
		
		
		ArrayList<String>alpha2 = new ArrayList<String>(List.copyOf(alpha));
		alpha.add("E");
		alpha.add("F");
		alpha.add("G");

		alpha2.addAll(alpha);
		System.out.println("Alpha2"+alpha2);

	}
}
