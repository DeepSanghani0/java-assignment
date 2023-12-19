package Module_2;
//• Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;

public class insert_array_firstposition 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>alpha = new ArrayList<String>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");

		
		System.out.println(alpha);
		alpha.add(0, "First");
		System.out.println(alpha);
	}
	
	
}
