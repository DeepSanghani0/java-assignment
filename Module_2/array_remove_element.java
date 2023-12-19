package Module_2;
//Write a Java program to remove the third element from an array list.
import java.util.ArrayList;

public class array_remove_element {
	public static void main(String[] args) 
	{
		
		ArrayList<String>alpha = new ArrayList<String>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("E");
		alpha.add("F");

		
		System.out.println(alpha);
		alpha.remove(2);
		System.out.println(alpha);
		System.out.println(alpha.indexOf("D"));
	}
}
